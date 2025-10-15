package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;
import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionRenderDebug {
    public static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static final int MAX_KEY_FRAMES = 50;
    public DashPathEffect mDashPathEffect;
    public Paint mFillPaint;
    public int mKeyFrameCount;
    public float[] mKeyFramePoints;
    public Paint mPaint;
    public Paint mPaintGraph;
    public Paint mPaintKeyframes;
    public Path mPath;
    public int[] mPathMode;
    public float[] mPoints;
    public float[] mRectangle;
    public int mShadowTranslate;
    public Paint mTextPaint;
    public final int RED_COLOR = -21965;
    public final int KEYFRAME_COLOR = -2067046;
    public final int GRAPH_COLOR = -13391360;
    public final int SHADOW_COLOR = 1996488704;
    public final int DIAMOND_SIZE = 10;
    public Rect mBounds = new Rect();
    public boolean mPresentationMode = false;

    public MotionRenderDebug(float textSize) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        Paint paint2 = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.mPaintKeyframes = paint3;
        paint3.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(style);
        Paint paint4 = new Paint();
        this.mPaintGraph = paint4;
        paint4.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(style);
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(textSize);
        this.mRectangle = new float[8];
        Paint paint6 = new Paint();
        this.mFillPaint = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    public void draw(Canvas canvas, HashMap<String, Motion> frameArrayList, int duration, int debugPath, int layoutWidth, int layoutHeight) {
        if (frameArrayList == null || frameArrayList.size() == 0) {
            return;
        }
        canvas.save();
        Iterator<Motion> it = frameArrayList.values().iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), duration, debugPath, layoutWidth, layoutHeight);
        }
        canvas.restore();
    }

    public void draw(Canvas canvas, Motion motionController, int duration, int debugPath, int layoutWidth, int layoutHeight) {
        int drawPath = motionController.getDrawPath();
        if (debugPath > 0 && drawPath == 0) {
            drawPath = 1;
        }
        if (drawPath == 0) {
            return;
        }
        this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        if (drawPath >= 1) {
            int i = duration / 16;
            float[] fArr = this.mPoints;
            if (fArr == null || fArr.length != i * 2) {
                this.mPoints = new float[i * 2];
                this.mPath = new Path();
            }
            int i2 = this.mShadowTranslate;
            canvas.translate(i2, i2);
            this.mPaint.setColor(1996488704);
            this.mFillPaint.setColor(1996488704);
            this.mPaintKeyframes.setColor(1996488704);
            this.mPaintGraph.setColor(1996488704);
            motionController.buildPath(this.mPoints, i);
            int i3 = drawPath;
            drawAll(canvas, i3, this.mKeyFrameCount, motionController, layoutWidth, layoutHeight);
            this.mPaint.setColor(-21965);
            this.mPaintKeyframes.setColor(-2067046);
            this.mFillPaint.setColor(-2067046);
            this.mPaintGraph.setColor(-13391360);
            int i4 = this.mShadowTranslate;
            canvas.translate(-i4, -i4);
            drawAll(canvas, i3, this.mKeyFrameCount, motionController, layoutWidth, layoutHeight);
            if (drawPath == 5) {
                drawRectangle(canvas, motionController);
            }
        }
    }

    public void drawAll(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        if (mode == 4) {
            drawPathAsConfigured(canvas);
        }
        if (mode == 2) {
            drawPathRelative(canvas);
        }
        if (mode == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, mode, keyFrames, motionController, layoutWidth, layoutHeight);
    }

    public final void drawBasicPath(Canvas canvas) {
        canvas.drawLines(this.mPoints, this.mPaint);
    }

    public final void drawTicks(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        int width;
        int height;
        float f;
        float f2;
        int i;
        if (motionController.getView() != null) {
            width = motionController.getView().getWidth();
            height = motionController.getView().getHeight();
        } else {
            width = 0;
            height = 0;
        }
        for (int i2 = 1; i2 < keyFrames - 1; i2++) {
            if (mode != 4 || this.mPathMode[i2 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i3 = i2 * 2;
                float f3 = fArr[i3];
                float f4 = fArr[i3 + 1];
                this.mPath.reset();
                this.mPath.moveTo(f3, f4 + 10.0f);
                this.mPath.lineTo(f3 + 10.0f, f4);
                this.mPath.lineTo(f3, f4 - 10.0f);
                this.mPath.lineTo(f3 - 10.0f, f4);
                this.mPath.close();
                int i4 = i2 - 1;
                motionController.getKeyFrame(i4);
                if (mode == 4) {
                    int i5 = this.mPathMode[i4];
                    if (i5 == 1) {
                        drawPathRelativeTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i5 == 0) {
                        drawPathCartesianTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else {
                        if (i5 == 2) {
                            f = f4;
                            f2 = f3;
                            i = 2;
                            drawPathScreenTicks(canvas, f3 - 0.0f, f4 - 0.0f, width, height, layoutWidth, layoutHeight);
                        }
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    }
                    f = f4;
                    f2 = f3;
                    i = 2;
                    canvas.drawPath(this.mPath, this.mFillPaint);
                } else {
                    f = f4;
                    f2 = f3;
                    i = 2;
                }
                if (mode == i) {
                    drawPathRelativeTicks(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (mode == 3) {
                    drawPathCartesianTicks(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (mode == 6) {
                    drawPathScreenTicks(canvas, f2 - 0.0f, f - 0.0f, width, height, layoutWidth, layoutHeight);
                }
                canvas.drawPath(this.mPath, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        if (fArr2.length > 1) {
            canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
            float[] fArr3 = this.mPoints;
            canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    public final void drawTranslation(Canvas canvas, float x1, float y1, float x2, float y2) {
        canvas.drawRect(x1, y1, x2, y2, this.mPaintGraph);
        canvas.drawLine(x1, y1, x2, y2, this.mPaintGraph);
    }

    public final void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
    }

    public final void drawPathAsConfigured(Canvas canvas) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < this.mKeyFrameCount; i++) {
            int i2 = this.mPathMode[i];
            if (i2 == 1) {
                z = true;
            }
            if (i2 == 0) {
                z2 = true;
            }
        }
        if (z) {
            drawPathRelative(canvas);
        }
        if (z2) {
            drawPathCartesian(canvas);
        }
    }

    public final void drawPathRelativeTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f - f3, f2 - f4);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (((x - f) * f5) + ((y - f2) * f6)) / (fHypot * fHypot);
        float f8 = f + (f5 * f7);
        float f9 = f2 + (f7 * f6);
        Path path = new Path();
        path.moveTo(x, y);
        path.lineTo(f8, f9);
        float fHypot2 = (float) Math.hypot(f8 - x, f9 - y);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(x, y, f8, f9, this.mPaintGraph);
    }

    public void getTextBounds(String text, Paint paint) {
        paint.getTextBounds(text, 0, text.length(), this.mBounds);
    }

    public final void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.mPaintGraph);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.mPaintGraph);
    }

    public final void drawPathCartesianTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMin2 = x - Math.min(f, f3);
        float fMax2 = Math.max(f2, f4) - y;
        String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f3 - f)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((fMin2 / 2.0f) - (this.mBounds.width() / 2)) + fMin, y - 20.0f, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(f, f3), y, this.mPaintGraph);
        String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f4 - f2)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, x + 5.0f, fMax - ((fMax2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(f2, f4), this.mPaintGraph);
    }

    public final void drawPathScreenTicks(Canvas canvas, float x, float y, int viewWidth, int viewHeight, int layoutWidth, int layoutHeight) {
        String str = "" + (((int) ((((x - (viewWidth / 2)) * 100.0f) / (layoutWidth - viewWidth)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((x / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, y - 20.0f, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(0.0f, 1.0f), y, this.mPaintGraph);
        String str2 = "" + (((int) ((((y - (viewHeight / 2)) * 100.0f) / (layoutHeight - viewHeight)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, x + 5.0f, 0.0f - ((y / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    public final void drawRectangle(Canvas canvas, Motion motionController) {
        this.mPath.reset();
        for (int i = 0; i <= 50; i++) {
            motionController.buildRect(i / 50, this.mRectangle, 0);
            Path path = this.mPath;
            float[] fArr = this.mRectangle;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.mPath;
            float[] fArr2 = this.mRectangle;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.mPath;
            float[] fArr3 = this.mRectangle;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.mPath;
            float[] fArr4 = this.mRectangle;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.mPath.close();
        }
        this.mPaint.setColor(1140850688);
        canvas.translate(2.0f, 2.0f);
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.translate(-2.0f, -2.0f);
        this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
        canvas.drawPath(this.mPath, this.mPaint);
    }
}
