package nestscrollingexample.project.com;

import android.support.v4.view.NestedScrollingParent;
import android.view.View;

/**
 * @author suzhuning
 * @date 2017/2/9.
 * Description:
 */
public class NestedScrollingParentUtil implements NestedScrollingParent {


    /**
     * 父View是否允许嵌套滑动
     * @param child             包含嵌套滑动父View的子View
     * @param target            实现嵌套滑动的子View
     * @param nestedScrollAxes  嵌套滑动方向，水平垂直或都支持
     * @return
     */
    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return false;
    }

    /**
     * onStartNestedScroll()方法返回true会调用该函数
     * 参数与onStartNestedScroll()方法一致
     */
    @Override
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {

    }

    /**
     * 嵌套滑动结束时调用
     * @param target    实现嵌套滑动的子View
     */
    @Override
    public void onStopNestedScroll(View target) {

    }

    /**
     * 嵌套滑动子View的滑动情况（进度）
     * @param target        实现嵌套滑动的子View
     * @param dxConsumed    水平方向上嵌套滑动的子View消耗（滑动）的距离
     * @param dyConsumed    垂直方向上嵌套滑动的子View消耗（滑动）的距离
     * @param dxUnconsumed  水平方向上嵌套滑动的子View未消耗（未滑动）的距离
     * @param dyUnconsumed  垂直方向上嵌套滑动的子View未消耗（未滑动）的距离
     */
    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {

    }

    /**
     * 嵌套滑动子View滑动之前的准备工作
     * @param target    实现嵌套滑动的子View
     * @param dx        水平方向上嵌套滑动的子View滑动的总距离
     * @param dy        垂直方向上嵌套滑动的子View滑动的总距离
     * @param consumed  consumed[0]水平方向与consumed[1]垂直方向上父View消耗（滑动）的距离
     */
    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {

    }

    /**
     * 嵌套滑动子View的fling(滑行)情况
     * @param target        实现嵌套滑动的子View
     * @param velocityX     水平方向上的速度
     * @param velocityY     竖直方向上的速度
     * @param consumed      子View是否消耗fling
     * @return         父View是否消耗了fling
     */
    @Override
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    /**
     * 嵌套滑动子View fling(滑行)前的准备工作
     * @param target    实现嵌套滑动的子View
     * @param velocityX 水平方向上的速度
     * @param velocityY 竖直方向上的速度
     * @return true 父View是否消耗了fling
     */
    @Override
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    /**
     * 嵌套滑动方向
     * @return 水平竖直或都支持
     */
    @Override
    public int getNestedScrollAxes() {
        return 0;
    }
}
