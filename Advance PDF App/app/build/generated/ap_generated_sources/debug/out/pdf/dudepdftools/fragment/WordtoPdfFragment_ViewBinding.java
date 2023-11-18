// Generated code from Butter Knife. Do not modify!
package pdf.dudepdftools.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.dd.morphingbutton.MorphingButton;
import java.lang.IllegalStateException;
import java.lang.Override;
import pdf.dudepdftools.R;

public class WordtoPdfFragment_ViewBinding implements Unbinder {
  private WordtoPdfFragment target;

  private View view7f0a015e;

  private View view7f0a0265;

  private View view7f0a0266;

  @UiThread
  public WordtoPdfFragment_ViewBinding(final WordtoPdfFragment target, View source) {
    this.target = target;

    View view;
    target.mLottieProgress = Utils.findRequiredViewAsType(source, R.id.lottie_progress, "field 'mLottieProgress'", LottieAnimationView.class);
    target.mTextView = Utils.findRequiredViewAsType(source, R.id.tv_word_file_name_bottom, "field 'mTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.open_pdf, "field 'mOpenPdf' and method 'openPdf'");
    target.mOpenPdf = Utils.castView(view, R.id.open_pdf, "field 'mOpenPdf'", MorphingButton.class);
    view7f0a015e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openPdf();
      }
    });
    view = Utils.findRequiredView(source, R.id.create_word_to_pdf, "field 'mCreateWordPdf' and method 'openWordToPdf'");
    target.mCreateWordPdf = Utils.castView(view, R.id.create_word_to_pdf, "field 'mCreateWordPdf'", MorphingButton.class);
    view7f0a0265 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openWordToPdf();
      }
    });
    target.mEnhancementOptionsRecycleView = Utils.findRequiredViewAsType(source, R.id.enhancement_options_recycle_view, "field 'mEnhancementOptionsRecycleView'", RecyclerView.class);
    target.layoutBottomSheet = Utils.findRequiredViewAsType(source, R.id.bottom_sheet, "field 'layoutBottomSheet'", LinearLayout.class);
    target.mUpArrow = Utils.findRequiredViewAsType(source, R.id.upArrow, "field 'mUpArrow'", ImageView.class);
    target.mLayout = Utils.findRequiredViewAsType(source, R.id.layout, "field 'mLayout'", RelativeLayout.class);
    target.mRecyclerViewFiles = Utils.findRequiredViewAsType(source, R.id.recyclerViewFiles, "field 'mRecyclerViewFiles'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.select_word_file, "method 'selectWordFile'");
    view7f0a0266 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selectWordFile();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WordtoPdfFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLottieProgress = null;
    target.mTextView = null;
    target.mOpenPdf = null;
    target.mCreateWordPdf = null;
    target.mEnhancementOptionsRecycleView = null;
    target.layoutBottomSheet = null;
    target.mUpArrow = null;
    target.mLayout = null;
    target.mRecyclerViewFiles = null;

    view7f0a015e.setOnClickListener(null);
    view7f0a015e = null;
    view7f0a0265.setOnClickListener(null);
    view7f0a0265 = null;
    view7f0a0266.setOnClickListener(null);
    view7f0a0266 = null;
  }
}
