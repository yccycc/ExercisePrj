package ss.yctech.com.exerciseprj;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View{
    public MyView(Context context, AttributeSet attrs) {
       super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
