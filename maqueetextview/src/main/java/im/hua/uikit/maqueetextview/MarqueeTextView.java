package im.hua.uikit.maqueetextview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by minhua.zmh on 2018/11/4.
 *
 * @author minhua.zmh
 * @version 1.0.0
 */
public class MarqueeTextView extends android.support.v7.widget.AppCompatTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

    @Override
    public boolean isSelected() {
        return true;
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return false;
    }
}
