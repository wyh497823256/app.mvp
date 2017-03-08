package com.h.appmvp.base;

/**
 * com.h.appmvp.base/mvp
 * 作者：Harvey on 2017/3/8 10:47
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public interface ILoadDataView<T> extends BaseView {
    /**
     * 加载数据
     *
     * @param data 数据
     */
    void loadData(T data);

    /**
     * 加载更多
     *
     * @param data 数据
     */
    void loadMoreData(T data);

    /**
     * 没有数据
     */
    void loadNoData();
}
