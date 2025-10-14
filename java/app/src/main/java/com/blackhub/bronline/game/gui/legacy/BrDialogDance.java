package com.blackhub.bronline.game.gui.legacy;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;


public class BrDialogDance implements ISAMPGUI {
    public ImageView mActiveLimb;
    public FrameLayout mActiveView;
    public GUIManager mGUIManager;
    public JNIActivity mContext = null;
    public PopupWindow mWindow = null;
    public View mRootView = null;
    public CountDownTimer mTimer = null;
    public ValueAnimator animator = null;
    public Animation anim = null;
    public int mTime = 0;
    public int mBank = 0;
    public int mEx = 0;
    public int mNextEx = 0;
    public int mMistakes = 0;
    public int mGratuity = 0;
    public int mNextGratuity = 0;
    public boolean mWasPressed = false;
    public boolean mClosedByTimer = false;
    public int mDrawBank = 0;
    public TextView mMistakesV = null;
    public TextView mBankV = null;
    public TextView mHint = null;
    public final int LEFT_ARM = 0;
    public final int LEFT_LEG = 1;
    public final int RIGHT_ARM = 2;
    public final int RIGHT_LEG = 3;
    public final int ELEMSNUM = 15;
    public ScaleDraw scaleDraw = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 15;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogDance();
    }

    public class ScaleDraw extends View {
        public int Active;
        public int[] OffsetX;
        public int[] Type;
        public Bitmap[] mBitmaps;
        public Paint mPaint;
        public int mWidth;
        public Random rnd;

        public ScaleDraw(Context context) {
            super(context);
            this.mWidth = 100;
            this.mBitmaps = new Bitmap[4];
            this.OffsetX = new int[15];
            this.Type = new int[15];
            this.Active = -1;
            this.mPaint = new Paint();
            Resources resources = getResources();
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            this.mBitmaps[0] = BitmapFactory.decodeResource(resources, R.drawable.img_hand);
            this.mBitmaps[1] = BitmapFactory.decodeResource(resources, R.drawable.img_leg);
            this.mBitmaps[2] = Bitmap.createBitmap(BitmapFactory.decodeResource(resources, R.drawable.img_hand), 0, 0, this.mBitmaps[0].getWidth(), this.mBitmaps[0].getHeight(), matrix, false);
            this.mBitmaps[3] = Bitmap.createBitmap(BitmapFactory.decodeResource(resources, R.drawable.img_leg), 0, 0, this.mBitmaps[1].getWidth(), this.mBitmaps[1].getHeight(), matrix, false);
            Random random = new Random();
            this.rnd = random;
            this.OffsetX[0] = -70;
            this.Type[0] = random.nextInt(4);
            for (int i = 1; i < 15; i++) {
                this.OffsetX[i] = (i * (-70)) - 70;
                this.Type[i] = this.rnd.nextInt(4);
                while (true) {
                    int[] iArr = this.Type;
                    if (iArr[i] == iArr[i - 1]) {
                        iArr[i] = this.rnd.nextInt(4);
                    }
                }
            }
        }

        public final void sendCurrentKey(int key) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", key);
                BrDialogDance.this.mGUIManager.sendJsonData(15, jSONObject);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }

        public void ProcessOnPressed(int index) throws JSONException {
            if (BrDialogDance.this.mWasPressed) {
                return;
            }
            int i = this.Active;
            if (i >= 0 && index == this.Type[i]) {
                BrDialogDance brDialogDance = BrDialogDance.this;
                int i2 = brDialogDance.mEx + 1;
                brDialogDance.mEx = i2;
                if (i2 == BrDialogDance.this.mNextEx) {
                    BrDialogDance brDialogDance2 = BrDialogDance.this;
                    brDialogDance2.mGratuity = brDialogDance2.mNextGratuity;
                }
                BrDialogDance.this.mBank += BrDialogDance.this.mGratuity;
                BrDialogDance.this.mBankV.setText(String.format("%,.0f ₽", Float.valueOf(BrDialogDance.this.mBank)));
                BrDialogDance.this.mActiveView.setBackground(ContextCompat.getDrawable(BrDialogDance.this.mContext, R.drawable.bg_oval_black_t2_green));
                BrDialogDance.this.mHint.setText(getContext().getString(R.string.br_dialog_dance_right));
                sendCurrentKey(1);
            } else {
                TextView textView = BrDialogDance.this.mMistakesV;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                BrDialogDance brDialogDance3 = BrDialogDance.this;
                int i3 = brDialogDance3.mMistakes + 1;
                brDialogDance3.mMistakes = i3;
                sb.append(i3);
                textView.setText(sb.toString());
                if (this.Active >= 0) {
                    BrDialogDance.this.mHint.setText(getContext().getString(R.string.br_dialog_dance_wrong));
                } else {
                    BrDialogDance.this.mHint.setText(getContext().getString(R.string.br_dialog_dance_early));
                }
                BrDialogDance.this.mActiveView.setBackground(ContextCompat.getDrawable(BrDialogDance.this.mContext, R.drawable.bg_oval_black_t2_red));
                JNIActivity jNIActivity = BrDialogDance.this.mContext;
                JNIActivity unused = BrDialogDance.this.mContext;
                Vibrator vibrator = (Vibrator) jNIActivity.getSystemService("vibrator");
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(200L);
                }
                sendCurrentKey(2);
            }
            BrDialogDance.this.mWasPressed = true;
        }

        public final int toPx(int dp) {
            return IntExtensionKt.dpToPx(dp, BrDialogDance.this.mContext);
        }

        public void Update() throws JSONException {
            int i = 0;
            while (i < 15) {
                if (toPx(this.OffsetX[i]) <= this.mWidth) {
                    Log.d("ANIMATION_TAG", "i = " + i + ", OffsetX[i] = " + this.OffsetX[i]);
                    Log.d("ANIMATION_TAG", "i = " + i + ", toPx(OffsetX[i] = " + toPx(this.OffsetX[i]));
                    StringBuilder sb = new StringBuilder();
                    sb.append("mWidth");
                    sb.append(this.mWidth);
                    Log.d("ANIMATION_TAG", sb.toString());
                    int[] iArr = this.OffsetX;
                    iArr[i] = iArr[i] + 1;
                } else {
                    Random random = new Random();
                    this.Type[i] = random.nextInt(4);
                    int i2 = i != 0 ? i - 1 : 14;
                    while (true) {
                        int[] iArr2 = this.Type;
                        if (iArr2[i2] != iArr2[i]) {
                            break;
                        } else {
                            iArr2[i] = random.nextInt(4);
                        }
                    }
                    this.OffsetX[i] = r2[i2] - 70;
                }
                if (this.Active != i && toPx(this.OffsetX[i]) >= (this.mWidth / 2) - toPx(35) && toPx(this.OffsetX[i]) <= (this.mWidth / 2) + toPx(35)) {
                    if (!BrDialogDance.this.mWasPressed && this.Active >= 0) {
                        JNIActivity jNIActivity = BrDialogDance.this.mContext;
                        JNIActivity unused = BrDialogDance.this.mContext;
                        Vibrator vibrator = (Vibrator) jNIActivity.getSystemService("vibrator");
                        if (vibrator.hasVibrator()) {
                            vibrator.vibrate(200L);
                        }
                        TextView textView = BrDialogDance.this.mMistakesV;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        BrDialogDance brDialogDance = BrDialogDance.this;
                        int i3 = brDialogDance.mMistakes + 1;
                        brDialogDance.mMistakes = i3;
                        sb2.append(i3);
                        textView.setText(sb2.toString());
                        BrDialogDance.this.mHint.setText(getContext().getString(R.string.br_dialog_dance_late));
                        sendCurrentKey(2);
                    }
                    BrDialogDance.this.mActiveLimb.setVisibility(0);
                    BrDialogDance.this.mActiveLimb.setImageBitmap(this.mBitmaps[this.Type[i]]);
                    BrDialogDance.this.mActiveView.setBackground(ContextCompat.getDrawable(BrDialogDance.this.mContext, R.drawable.bg_oval_black_t2_gray));
                    this.Active = i;
                    BrDialogDance.this.mWasPressed = false;
                }
                i++;
            }
            invalidate();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.mWidth = canvas.getWidth();
            for (int i = 0; i < 15; i++) {
                this.mPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.mPaint.setAlpha(160);
                canvas.drawRoundRect(toPx(this.OffsetX[i] - 8), toPx(5), toPx(this.OffsetX[i] + 53), toPx(65), toPx(4), toPx(4), this.mPaint);
                this.mPaint.setAlpha(255);
                canvas.drawBitmap(this.mBitmaps[this.Type[i]], (Rect) null, new RectF(toPx(this.OffsetX[i]), toPx(10), toPx(this.OffsetX[i] + 45), toPx(60)), this.mPaint);
            }
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mContext = activity;
        this.mGUIManager = manager;
        if (this.mWindow == null) {
            this.mRootView = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.br_dance, (ViewGroup) null, false);
            this.mContext = activity;
            PopupWindow popupWindow = new PopupWindow(this.mRootView, -1, -1, true);
            this.mWindow = popupWindow;
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mWindow.setSoftInputMode(16);
            UsefulKt.setCustomTouchInterceptor(this.mWindow);
            this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDance.1
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() throws JSONException {
                    BrDialogDance.this.mTimer.cancel();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("t", 0);
                        jSONObject.put(BlackPassKeys.CL_MARATHON_LEVEL, BrDialogDance.this.mClosedByTimer ? 1 : 0);
                        jSONObject.put("b", BrDialogDance.this.mBank);
                        jSONObject.put("e", BrDialogDance.this.mEx);
                        BrDialogDance.this.mGUIManager.sendJsonData(15, jSONObject);
                    } catch (Exception e) {
                        FirebaseCrashlytics.getInstance().recordException(e);
                    }
                    BrDialogDance.this.mGUIManager.closeGUI(null, 15);
                }
            });
        }
        this.anim = AnimationUtils.loadAnimation(this.mContext, R.anim.button_click);
        this.mRootView.findViewById(R.id.br_dance_close).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDance.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(BrDialogDance.this.anim);
                new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDance.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BrDialogDance.this.mWindow.dismiss();
                    }
                }, 400L);
            }
        });
        this.mActiveLimb = (ImageView) this.mRootView.findViewById(R.id.br_dance_alimb);
        this.mMistakesV = (TextView) this.mRootView.findViewById(R.id.br_dance_mistakes_text);
        this.mBankV = (TextView) this.mRootView.findViewById(R.id.br_dance_bank_text);
        this.mHint = (TextView) this.mRootView.findViewById(R.id.br_dance_hint);
        this.mBankV.setText("0 ₽");
        this.mMistakesV.setText("0");
        this.mHint.setText(this.mContext.getString(R.string.br_dialog_dance_help));
        try {
            this.mTime = json.getInt("ti");
            this.mEx = json.getInt("e");
            this.mNextEx = json.getInt("ne");
            this.mGratuity = json.getInt("g");
            this.mNextGratuity = json.getInt("ng");
            this.mDrawBank = json.getInt("b");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.mDrawBank != 0) {
            this.mRootView.findViewById(R.id.br_dance_bank).setVisibility(4);
        }
        final TextView textView = (TextView) this.mRootView.findViewById(R.id.br_dance_time);
        this.mTimer = new CountDownTimer(this.mTime * 1000, 15L) { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDance.3
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) throws JSONException {
                long j = millisUntilFinished / 1000;
                if (j > 59) {
                    textView.setText(BrDialogDance.this.mContext.getString(R.string.br_dialog_dance_timer_min_sec, Long.valueOf(j / 60), Long.valueOf(j % 60)));
                } else {
                    textView.setText(BrDialogDance.this.mContext.getString(R.string.br_dialog_dance_timer_sec, Long.valueOf(j)));
                }
                BrDialogDance.this.scaleDraw.Update();
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                BrDialogDance.this.mClosedByTimer = true;
                BrDialogDance.this.mWindow.dismiss();
            }
        }.start();
        this.scaleDraw = new ScaleDraw(this.mContext);
        ((FrameLayout) this.mRootView.findViewById(R.id.br_dance_bar_frame)).addView(this.scaleDraw);
        this.mActiveView = (FrameLayout) this.mRootView.findViewById(R.id.br_dance_active);
        final FrameLayout[] frameLayoutArr = {(FrameLayout) this.mRootView.findViewById(R.id.br_dance_left_up), (FrameLayout) this.mRootView.findViewById(R.id.br_dance_left_down), (FrameLayout) this.mRootView.findViewById(R.id.br_dance_right_up), (FrameLayout) this.mRootView.findViewById(R.id.br_dance_right_down)};
        for (int i = 0; i < 4; i++) {
            frameLayoutArr[i].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDance.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    int i2 = -1;
                    for (int i3 = 0; i3 < 4; i3++) {
                        if (frameLayoutArr[i3] == view) {
                            i2 = i3;
                        }
                    }
                    BrDialogDance.this.scaleDraw.ProcessOnPressed(i2);
                }
            });
        }
        this.mWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
        try {
            if (json.getInt("t") != 0) {
                return;
            }
            this.mHint.setText(this.mContext.getString(R.string.br_dialog_dance_tips, String.format("%,.0f ₽", Float.valueOf(json.getInt("m")))));
            this.mBank += json.getInt("m");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow == null) {
            return false;
        }
        return popupWindow.isShowing();
    }
}
