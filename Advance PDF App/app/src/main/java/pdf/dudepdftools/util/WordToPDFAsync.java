package pdf.dudepdftools.util;

import android.os.AsyncTask;

import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.PdfSecurityOptions;
import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

import pdf.dudepdftools.interfaces.OnPDFCreatedInterface;

public class WordToPDFAsync extends AsyncTask<Void, Void, Void> {
    private final OnPDFCreatedInterface mOnPDFCreatedInterface;
    private boolean mSuccess;
    private final String mPath;
    private final boolean mIsPasswordProtected;
    private final String mDestPath;
    private final String mPassword;

    public WordToPDFAsync(String parentPath, String destPath,
                          OnPDFCreatedInterface onPDFCreated, boolean isPasswordProtected, String password) {
        mPath = parentPath;
        mDestPath = destPath;
        this.mOnPDFCreatedInterface = onPDFCreated;
        mIsPasswordProtected = isPasswordProtected;
        mPassword = password;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mSuccess = true;
        mOnPDFCreatedInterface.onPDFCreationStarted();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            // Load the Word document
            Document doc = new Document(mPath);

            if (mIsPasswordProtected) {
                // If password protection is enabled
                // Create an instance of PdfEncryptionDetails
                PdfSaveOptions saveOption = new PdfSaveOptions();
                saveOption.setSecurityOptions(new PdfSecurityOptions());
                saveOption.getSecurityOptions().setUserPassword(mPassword);
                saveOption.getSecurityOptions().setOwnerPassword(mPassword);
                saveOption.getSecurityOptions().setExtractContentPermission(false);
                saveOption.getSecurityOptions().setPrintPermission(false);
                doc.save(mDestPath);
            } else {
                doc.save(mDestPath, SaveFormat.PDF);
            }

        } catch (Exception e) {
            e.printStackTrace();
            mSuccess = false;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        mOnPDFCreatedInterface.onPDFCreated(mSuccess, mPath);
    }
}
