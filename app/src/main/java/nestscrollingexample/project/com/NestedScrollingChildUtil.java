package nestscrollingexample.project.com;

import android.support.v4.view.NestedScrollingChild;

/**
 * @author suzhuning
 * @date 2017/2/9.
 * Description:
 */
public class NestedScrollingChildUtil implements NestedScrollingChild {
    /**
     * 设置是否支持嵌套滑动
     *
     * @param enabled true与false表示支持与不支持
     */
    @Override
    public void setNestedScrollingEnabled(boolean enabled) {

    }

    /**
     * 判断嵌套滑动是否可用
     *
     * @return true表示支持嵌套滑动
     */
    @Override
    public boolean isNestedScrollingEnabled() {
        return false;
    }

    /**
     * 开始嵌套滑动
     *
     * @param axes 方向轴，水平方向与竖直方向
     * @return
     */
    @Override
    public boolean startNestedScroll(int axes) {
        return false;
    }

    /**
     * 停止嵌套滑动
     */
    @Override
    public void stopNestedScroll() {

    }

    /**
     * 判断父View是否支持嵌套滑动
     *
     * @return true与false表示支持与不支持
     */
    @Override
    public boolean hasNestedScrollingParent() {
        return false;
    }

    /**
     * 处理滑动事件
     *
     * @param dxConsumed     水平方向上消耗(滑动)的距离
     * @param dyConsumed     竖直方向上消耗(滑动)的距离
     * @param dxUnconsumed   水平方向上未消耗(未滑动)的距离
     * @param dyUnconsumed   竖直方向上未消耗(未滑动)的距离
     * @param offsetInWindow 窗体偏移量
     * @return true表示事件已经分发，false表示没有分发
     */
    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return false;
    }

    /**
     * 处理滑动事件前的准备工作
     *
     * @param dx             水平方向上滑动的距离
     * @param dy             竖直方向上滑动的距离
     * @param consumed       父view消耗的距离
     * @param offsetInWindow 窗体偏移量
     * @return 父View是否处理了嵌套滑动
     */
    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return false;
    }

    /**
     * fling(滑行)前的准备工作
     *
     * @param velocityX 水平方向上的速度
     * @param velocityY 竖直方向上的速度
     * @param consumed  是否被消耗
     * @return true表示被消耗，false反之
     */
    @Override
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    /**
     * fling(滑行)时调用
     *
     * @param velocityX 水平方向上的速度
     * @param velocityY 竖直方向上的速度
     * @return true表示被消耗，false反之
     */
    @Override
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return false;
    }
}
