package com.blackhub.bronline.game.common.mkloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.type.LoaderView;
import com.blackhub.bronline.game.common.mkloader.util.LoaderGenerator;

/* loaded from: classes3.dex */
public class MKLoader extends View implements InvalidateListener {
    public LoaderView loaderView;

    public MKLoader(Context context) {
        super(context);
        initialize(context, null);
    }

    public MKLoader(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public MKLoader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    public final void initialize(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3489R.styleable.MKLoader);
        LoaderView loaderViewGenerateLoaderView = LoaderGenerator.generateLoaderView(typedArrayObtainStyledAttributes.getInt(1, -1));
        this.loaderView = loaderViewGenerateLoaderView;
        loaderViewGenerateLoaderView.setColor(typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#ffffff")));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(this.loaderView.getDesiredWidth(), widthMeasureSpec), View.resolveSize(this.loaderView.getDesiredHeight(), heightMeasureSpec));
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.loaderView.setSize(getWidth(), getHeight());
        this.loaderView.initializeObjects();
        this.loaderView.setUpAnimation();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        this.loaderView.draw(canvas);
    }

    @Override // com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener
    public void reDraw() {
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LoaderView loaderView = this.loaderView;
        if (loaderView == null || !loaderView.isDetached()) {
            return;
        }
        this.loaderView.setInvalidateListener(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LoaderView loaderView = this.loaderView;
        if (loaderView != null) {
            loaderView.onDetach();
        }
    }
}
