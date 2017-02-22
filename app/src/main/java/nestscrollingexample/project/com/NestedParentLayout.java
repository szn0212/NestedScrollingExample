package nestscrollingexample.project.com;

import android.content.Context;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * @author suzhuning
 * @date 2017/2/9.
 * Description:
 */
public class NestedParentLayout extends FrameLayout implements NestedScrollingParent {

    private NestedScrollingParentHelper nestedScrollingParentHelper;

    public NestedParentLayout(Context context) {
        super(context);
        init();
    }

    public NestedParentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NestedParentLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public NestedParentLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return true;
    }

    @Override
    public void onNestedScrollAccepted(View child, View target, int axes) {
        nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes);
    }

    @Override
    public void onStopNestedScroll(View child) {
        nestedScrollingParentHelper.onStopNestedScroll(child);
    }

    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        super.onNestedPreScroll(target, dx, dy, consumed);

        //向右滑动
        if(dx > 0){
            //滑动到边界
            if(target.getRight() + dx > getWidth()){
                dx = target.getRight() + dx - getWidth();
                //父View消耗
                offsetLeftAndRight(dx);
                consumed[0] += dx;
            }
        }else { //向左滑动
            if(target.getLeft() + dx < 0){
                dx = dx + target.getLeft();
                //父View消耗
                offsetLeftAndRight(dx);
                consumed[1] += dx;
            }
        }

        //向下滑动
        if(dy > 0){
            if(target.getBottom() + dy > getHeight()){
                dy = target.getBottom() + dy - getHeight();
                //父View消耗
                offsetTopAndBottom(dy);
                consumed[1] += dy;
            }
        }else { //向上滑动
            if(target.getTop() + dy < 0){
                dy = dy + target.getTop();
                //父View消耗
                offsetTopAndBottom(dy);
                consumed[1] += dy;
            }
        }
    }

    @Override
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        return super.onNestedFling(target, velocityX, velocityY, consumed);
    }

    @Override
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return super.onNestedPreFling(target, velocityX, velocityY);
    }

    @Override
    public int getNestedScrollAxes() {
        return nestedScrollingParentHelper.getNestedScrollAxes();
    }

}
