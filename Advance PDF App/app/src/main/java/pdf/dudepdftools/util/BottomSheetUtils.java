package pdf.dudepdftools.util;

import android.app.Activity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import pdf.dudepdftools.fragment.WordtoPdfFragment;
import pdf.dudepdftools.interfaces.BottomSheetPopulate;

public class BottomSheetUtils  {

    private final Activity mContext;

    public BottomSheetUtils(Activity context) {
        this.mContext = context;
    }

    public void showHideSheet(BottomSheetBehavior sheetBehavior) {
        if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void populateBottomSheetWithPDFs(BottomSheetPopulate listener) {
        new PopulateBottomSheetList(listener, new DirectoryUtils(mContext)).execute();
    }

    /**
     * Retrieves a list of available excel files on the device
     * @param listener a bottom sheet listener used to inform the caller when the list of files
     * is available
     */
    public void populateBottomSheetWithExcelFiles(BottomSheetPopulate listener) {
        new PopulateBottomSheetListWithExcelFiles(listener, new DirectoryUtils(mContext)).execute();
    }

    public void populateBottomSheetWithWordFiles(WordtoPdfFragment wordtoPdfFragment) {
    }
}
