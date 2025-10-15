package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ViewStubProxy {
    public ViewDataBinding mContainingBinding;
    public ViewStub.OnInflateListener mOnInflateListener;
    public ViewStub.OnInflateListener mProxyListener;
    public View mRoot;
    public ViewDataBinding mViewDataBinding;
    public ViewStub mViewStub;

    public ViewStubProxy(@NonNull ViewStub viewStub) {
        ViewStub.OnInflateListener onInflateListener = new ViewStub.OnInflateListener() { // from class: androidx.databinding.ViewStubProxy.1
            @Override // android.view.ViewStub.OnInflateListener
            public void onInflate(ViewStub viewStub2, View view) {
                ViewStubProxy.this.mRoot = view;
                ViewStubProxy viewStubProxy = ViewStubProxy.this;
                viewStubProxy.mViewDataBinding = DataBindingUtil.bind(viewStubProxy.mContainingBinding.mBindingComponent, view, viewStub2.getLayoutResource());
                ViewStubProxy.this.mViewStub = null;
                if (ViewStubProxy.this.mOnInflateListener != null) {
                    ViewStubProxy.this.mOnInflateListener.onInflate(viewStub2, view);
                    ViewStubProxy.this.mOnInflateListener = null;
                }
                ViewStubProxy.this.mContainingBinding.invalidateAll();
                ViewStubProxy.this.mContainingBinding.forceExecuteBindings();
            }
        };
        this.mProxyListener = onInflateListener;
        this.mViewStub = viewStub;
        viewStub.setOnInflateListener(onInflateListener);
    }

    public void setContainingBinding(@NonNull ViewDataBinding viewDataBinding) {
        this.mContainingBinding = viewDataBinding;
    }

    public boolean isInflated() {
        return this.mRoot != null;
    }

    public View getRoot() {
        return this.mRoot;
    }

    @Nullable
    public ViewDataBinding getBinding() {
        return this.mViewDataBinding;
    }

    @Nullable
    public ViewStub getViewStub() {
        return this.mViewStub;
    }

    public void setOnInflateListener(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.mViewStub != null) {
            this.mOnInflateListener = onInflateListener;
        }
    }
}
