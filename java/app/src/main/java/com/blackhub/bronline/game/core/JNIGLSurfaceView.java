package com.blackhub.bronline.game.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;


public class JNIGLSurfaceView extends GLSurfaceView {
    public static final boolean DEBUG = true;

    public JNIGLSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(3);
        setEGLConfigChooser(new JNIConfigChooser(context));
        setRenderer(new JNIRenderer());
        setPreserveEGLContextOnPause(true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int pointerCount = event.getPointerCount();
        final int x = 0;
        final int y = 0;
        final int x2 = 0;
        final int y2 = 0;
        final int x3 = 0;
        final int y3 = 0;
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = event.getPointerId(i);
            if (pointerId == 0) {
                x = (int) event.getX(i);
                y = (int) event.getY(i);
            } else if (pointerId == 1) {
                x2 = (int) event.getX(i);
                y2 = (int) event.getY(i);
            } else if (pointerId == 2) {
                x3 = (int) event.getX(i);
                y3 = (int) event.getY(i);
            }
        }
        final int pointerId2 = event.getPointerId(event.getActionIndex());
        final int actionMasked = event.getActionMasked();
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                JNILib.multiTouchEvent(actionMasked, pointerId2, x, y, x2, y2, x3, y3);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        setRenderMode(1);
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                JNILib.resumeEvent();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                JNILib.pauseEvent();
            }
        });
        setRenderMode(0);
    }
}
