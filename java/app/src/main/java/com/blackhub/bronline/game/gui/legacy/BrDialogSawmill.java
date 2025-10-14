package com.blackhub.bronline.game.gui.legacy;

import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;


public class BrDialogSawmill implements ISAMPGUI {
    public static final int TYPE_NONE = 0;
    public static final int TYPE_READY = 1;
    public static final int TYPE_RIGHT = 2;
    public static final int TYPE_WRONG = 3;
    public static boolean mClosed;
    public ProgressBar mBar;
    public CountDownTimer mCountDownTimer;
    public GUIManager mGUIManager;
    public TextView mText;
    public int mTime;
    public JNIActivity mContext = null;
    public PopupWindow mWindow = null;
    public View mRootView = null;
    public Animation anim = null;
    public View[] Chunks = new View[18];
    public int[] ChunksTypes = new int[18];
    public int Mistakes = 0;
    public int mResult = -1;
    public int progress = 0;
    public int PrevId = 0;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 23;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogSawmill();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        int iNextInt;
        int[] iArr;
        this.mGUIManager = manager;
        this.mContext = activity;
        if (this.mWindow == null) {
            this.mRootView = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.br_sawmill, (ViewGroup) null, false);
            PopupWindow popupWindow = new PopupWindow(this.mRootView, -1, -1, true);
            this.mWindow = popupWindow;
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mWindow.setSoftInputMode(16);
            UsefulKt.setCustomTouchInterceptor(this.mWindow);
            UsefulKt.hideSystemUI(this.mWindow.getContentView());
        }
        this.mTime = 20000;
        this.mBar = (ProgressBar) this.mRootView.findViewById(R.id.br_sawmill_progress);
        this.mText = (TextView) this.mRootView.findViewById(R.id.br_sawmill_text);
        this.Chunks[0] = this.mRootView.findViewById(R.id.br_sawmill_1);
        this.Chunks[1] = this.mRootView.findViewById(R.id.br_sawmill_2);
        this.Chunks[2] = this.mRootView.findViewById(R.id.br_sawmill_3);
        this.Chunks[3] = this.mRootView.findViewById(R.id.br_sawmill_4);
        this.Chunks[4] = this.mRootView.findViewById(R.id.br_sawmill_5);
        this.Chunks[5] = this.mRootView.findViewById(R.id.br_sawmill_6);
        this.Chunks[6] = this.mRootView.findViewById(R.id.br_sawmill_7);
        this.Chunks[7] = this.mRootView.findViewById(R.id.br_sawmill_8);
        this.Chunks[8] = this.mRootView.findViewById(R.id.br_sawmill_9);
        this.Chunks[9] = this.mRootView.findViewById(R.id.br_sawmill_10);
        this.Chunks[10] = this.mRootView.findViewById(R.id.br_sawmill_11);
        this.Chunks[11] = this.mRootView.findViewById(R.id.br_sawmill_12);
        this.Chunks[12] = this.mRootView.findViewById(R.id.br_sawmill_13);
        this.Chunks[13] = this.mRootView.findViewById(R.id.br_sawmill_14);
        this.Chunks[14] = this.mRootView.findViewById(R.id.br_sawmill_15);
        this.Chunks[15] = this.mRootView.findViewById(R.id.br_sawmill_16);
        this.Chunks[16] = this.mRootView.findViewById(R.id.br_sawmill_17);
        this.Chunks[17] = this.mRootView.findViewById(R.id.br_sawmill_18);
        this.mText.setText("0%");
        this.mBar.setProgress(0);
        for (int i = 0; i < 18; i++) {
            this.Chunks[i].setBackgroundColor(0);
        }
        Random random = new Random();
        for (int i2 = 0; i2 < 6; i2++) {
            while (true) {
                iNextInt = random.nextInt(18);
                while (true) {
                    iArr = this.ChunksTypes;
                    if (iArr[iNextInt] != 1) {
                        break;
                    } else {
                        iNextInt = random.nextInt(18);
                    }
                }
                if (iNextInt != 0 && iNextInt != 17) {
                    if (iArr[iNextInt - 1] == 1 || iArr[iNextInt + 1] == 1) {
                    }
                } else if (iNextInt != 0 || iArr[iNextInt + 1] != 1) {
                    if (iNextInt != 17 || iArr[iNextInt - 1] != 1) {
                        break;
                    }
                }
            }
            iArr[iNextInt] = 1;
        }
        for (int i3 = 0; i3 < 18; i3++) {
            if (this.ChunksTypes[i3] == 1) {
                this.Chunks[i3].setBackgroundColor(-1953524);
            }
        }
        new Handler().postDelayed(new RunnableC42591(), 3000L);
        ((Button) this.mRootView.findViewById(R.id.br_sawmill_butt)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogSawmill.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int progress = (int) ((BrDialogSawmill.this.mBar.getProgress() / BrDialogSawmill.this.mBar.getMax()) * 20.0f);
                int i4 = progress - 1;
                if (i4 < 0 || i4 >= 18) {
                    return;
                }
                view.startAnimation(AnimationUtils.loadAnimation(BrDialogSawmill.this.mContext, R.anim.button_click));
                view.setBackgroundResource(R.drawable.img_sawmill_abutt);
                BrDialogSawmill brDialogSawmill = BrDialogSawmill.this;
                int i5 = brDialogSawmill.ChunksTypes[i4];
                if (i5 == 1) {
                    brDialogSawmill.Chunks[i4].setBackgroundColor(-10625753);
                    BrDialogSawmill.this.ChunksTypes[i4] = 2;
                    return;
                }
                if (i5 == 0) {
                    while (progress < 18) {
                        BrDialogSawmill brDialogSawmill2 = BrDialogSawmill.this;
                        int[] iArr2 = brDialogSawmill2.ChunksTypes;
                        int i6 = iArr2[progress];
                        if (i6 != 0) {
                            if (i6 == 1) {
                                iArr2[progress] = 3;
                                brDialogSawmill2.Chunks[progress].setBackgroundColor(-8355712);
                                BrDialogSawmill.this.Mistakes++;
                                return;
                            }
                            return;
                        }
                        progress++;
                    }
                }
            }
        });
        this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogSawmill.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() throws JSONException {
                try {
                    CountDownTimer countDownTimer = BrDialogSawmill.this.mCountDownTimer;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    } else {
                        BrDialogSawmill.mClosed = true;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("t", 0);
                    jSONObject.put("r", BrDialogSawmill.this.mResult);
                    BrDialogSawmill.this.mGUIManager.sendJsonData(23, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrDialogSawmill$1 */
    public class RunnableC42591 implements Runnable {
        public RunnableC42591() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BrDialogSawmill.mClosed) {
                BrDialogSawmill.mClosed = false;
                return;
            }
            BrDialogSawmill.this.mCountDownTimer = new CountDownTimer(BrDialogSawmill.this.mTime, 10L) { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogSawmill.1.1
                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    BrDialogSawmill.this.mBar.setProgress((int) (((BrDialogSawmill.this.mTime - millisUntilFinished) / BrDialogSawmill.this.mTime) * BrDialogSawmill.this.mBar.getMax()), true);
                    int progress = (int) ((BrDialogSawmill.this.mBar.getProgress() / BrDialogSawmill.this.mBar.getMax()) * 100.0f);
                    BrDialogSawmill brDialogSawmill = BrDialogSawmill.this;
                    if (progress != brDialogSawmill.progress) {
                        brDialogSawmill.mText.setText(BrDialogSawmill.this.mContext.getString(R.string.common_value_and_percent, Integer.valueOf(progress)));
                        BrDialogSawmill.this.progress = progress;
                    }
                    int progress2 = (int) ((BrDialogSawmill.this.mBar.getProgress() / BrDialogSawmill.this.mBar.getMax()) * 20.0f);
                    BrDialogSawmill brDialogSawmill2 = BrDialogSawmill.this;
                    if (progress2 != brDialogSawmill2.PrevId) {
                        ((Button) brDialogSawmill2.mRootView.findViewById(R.id.br_sawmill_butt)).setBackgroundResource(R.drawable.img_sawmill_butt);
                        int i = progress2 - 1;
                        if (i < 0 || i >= 18) {
                            if (i > 0) {
                                int i2 = 17;
                                while (true) {
                                    if (i2 < 0) {
                                        break;
                                    }
                                    BrDialogSawmill brDialogSawmill3 = BrDialogSawmill.this;
                                    int[] iArr = brDialogSawmill3.ChunksTypes;
                                    int i3 = iArr[i2];
                                    if (i3 == 0) {
                                        i2--;
                                    } else if (i3 == 1) {
                                        iArr[i2] = 3;
                                        brDialogSawmill3.Chunks[i2].setBackgroundColor(-8355712);
                                        BrDialogSawmill.this.Mistakes++;
                                    }
                                }
                            }
                        } else if (BrDialogSawmill.this.ChunksTypes[i] == 0) {
                            int i4 = progress2 - 2;
                            while (true) {
                                if (i4 < 0) {
                                    break;
                                }
                                BrDialogSawmill brDialogSawmill4 = BrDialogSawmill.this;
                                int[] iArr2 = brDialogSawmill4.ChunksTypes;
                                int i5 = iArr2[i4];
                                if (i5 == 0) {
                                    i4--;
                                } else if (i5 == 1) {
                                    iArr2[i4] = 3;
                                    brDialogSawmill4.Chunks[i4].setBackgroundColor(-8355712);
                                    BrDialogSawmill.this.Mistakes++;
                                }
                            }
                        }
                        BrDialogSawmill.this.PrevId = progress2;
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    BrDialogSawmill.this.mBar.setProgress(BrDialogSawmill.this.mBar.getMax());
                    BrDialogSawmill.this.mText.setText(BrDialogSawmill.this.mContext.getString(R.string.common_value_and_percent, 100));
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogSawmill.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BrDialogSawmill brDialogSawmill = BrDialogSawmill.this;
                            if (brDialogSawmill.Mistakes > 2) {
                                brDialogSawmill.mResult = 0;
                            } else {
                                brDialogSawmill.mResult = 1;
                            }
                            brDialogSawmill.mWindow.dismiss();
                        }
                    }, 1000L);
                }
            };
            BrDialogSawmill.this.mCountDownTimer.start();
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
