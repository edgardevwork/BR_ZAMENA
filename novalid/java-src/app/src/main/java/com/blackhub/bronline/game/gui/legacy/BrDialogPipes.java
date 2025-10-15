package com.blackhub.bronline.game.gui.legacy;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BrDialogPipes extends DialogFragment implements ISAMPGUI {
    public Animation mAnim;
    public Button mExitButton;
    public Button mHelpButton;
    public TextView mTextHelp;
    public JNIActivity mContext = null;
    public boolean mResult = false;
    public CountDownTimer mTimer = null;
    public int mSelectedVar = -1;
    public int[] mIsAngle = new int[23];
    public boolean[] mIsActive = new boolean[23];
    public FrameLayout[] mPipesVar = new FrameLayout[2];
    public RelativeLayout[] mPipes = new RelativeLayout[23];
    public int mCountTimer = 0;
    public GUIManager mGUIManager = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 8;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogPipes();
    }

    public final void CheckPath() {
        float[] fArr = new float[13];
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            if (!this.mIsActive[i2]) {
                return;
            }
            i |= this.mIsAngle[i2] << i2;
            fArr[i2] = this.mPipes[i2].getChildAt(0).getRotation();
        }
        if (i == 7017 && fArr[0] == 90.0f && fArr[1] == 90.0f && fArr[2] == 90.0f && fArr[3] == 270.0f && fArr[4] == 0.0f && fArr[5] == 180.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 180.0f && fArr[9] == 0.0f && fArr[10] == 0.0f && fArr[11] == 90.0f && fArr[12] == 270.0f) {
            this.mResult = true;
            this.mTimer = new CountDownTimer(3750L, 250L) { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.1
                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    BrDialogPipes brDialogPipes = BrDialogPipes.this;
                    if (brDialogPipes.mCountTimer >= 13) {
                        return;
                    }
                    int[] iArr = brDialogPipes.mIsAngle;
                    BrDialogPipes brDialogPipes2 = BrDialogPipes.this;
                    if (iArr[brDialogPipes2.mCountTimer] == 0) {
                        ((ImageView) brDialogPipes2.mPipes[BrDialogPipes.this.mCountTimer].getChildAt(0)).setImageResource(R.drawable.img_pipes_direct_blue);
                    } else {
                        ((ImageView) brDialogPipes2.mPipes[BrDialogPipes.this.mCountTimer].getChildAt(0)).setImageResource(R.drawable.img_pipes_angle_blue);
                    }
                    BrDialogPipes.this.mCountTimer++;
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    BrDialogPipes.this.dismissAllowingStateLoss();
                }
            }.start();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) throws JSONException {
        CountDownTimer countDownTimer = this.mTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        onPipesGuiClosed();
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setStyle(0, R.style.CustomDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.br_pipes, (ViewGroup) null, false);
        this.mContext = (JNIActivity) getContext();
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setDimAmount(0.0f);
        getDialog().getWindow().setLayout(-1, -1);
        this.mResult = false;
        this.mSelectedVar = -1;
        this.mCountTimer = 0;
        this.mAnim = AnimationUtils.loadAnimation(getContext(), R.anim.button_click);
        this.mTextHelp = (TextView) viewInflate.findViewById(R.id.br_pipes_hint);
        this.mPipesVar[0] = (FrameLayout) viewInflate.findViewById(R.id.br_pipes_dir);
        this.mPipesVar[1] = (FrameLayout) viewInflate.findViewById(R.id.br_pipes_ang);
        this.mHelpButton = (Button) viewInflate.findViewById(R.id.br_pipes_help);
        this.mExitButton = (Button) viewInflate.findViewById(R.id.br_pipes_exit);
        this.mPipes[0] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_0);
        this.mPipes[1] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_1);
        this.mPipes[2] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_2);
        this.mPipes[3] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_3);
        this.mPipes[4] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_4);
        this.mPipes[5] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_5);
        this.mPipes[6] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_6);
        this.mPipes[7] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_7);
        this.mPipes[8] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_8);
        this.mPipes[9] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_9);
        this.mPipes[10] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_10);
        this.mPipes[11] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_11);
        this.mPipes[12] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_12);
        this.mPipes[13] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_13);
        this.mPipes[14] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_14);
        this.mPipes[15] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_15);
        this.mPipes[16] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_16);
        this.mPipes[17] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_17);
        this.mPipes[18] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_18);
        this.mPipes[19] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_19);
        this.mPipes[20] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_20);
        this.mPipes[21] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_21);
        this.mPipes[22] = (RelativeLayout) viewInflate.findViewById(R.id.br_pipes_22);
        this.mTextHelp.setText(this.mContext.getString(R.string.pipes_dialog_hint_1));
        for (int i = 0; i < 2; i++) {
            this.mPipesVar[i].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (BrDialogPipes.this.mResult) {
                        return;
                    }
                    view.startAnimation(BrDialogPipes.this.mAnim);
                    int i2 = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (view == BrDialogPipes.this.mPipesVar[i3]) {
                            i2 = i3;
                        }
                    }
                    if (BrDialogPipes.this.mSelectedVar != i2) {
                        view.setBackground(ContextCompat.getDrawable(BrDialogPipes.this.getContext(), R.drawable.bg_rectangle_gray10_cr10_t1_orange));
                        if (BrDialogPipes.this.mSelectedVar != -1) {
                            BrDialogPipes.this.mPipesVar[BrDialogPipes.this.mSelectedVar].setBackground(ContextCompat.getDrawable(BrDialogPipes.this.getContext(), R.drawable.bg_rectangle_gray10_cr10_t1_gray));
                        }
                        BrDialogPipes.this.mSelectedVar = i2;
                        BrDialogPipes.this.mTextHelp.setText(BrDialogPipes.this.mContext.getString(R.string.pipes_dialog_hint_2));
                    }
                }
            });
        }
        this.mHelpButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogPipes.this.mResult) {
                    return;
                }
                view.startAnimation(BrDialogPipes.this.mAnim);
            }
        });
        this.mExitButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogPipes.this.mResult) {
                    return;
                }
                view.startAnimation(BrDialogPipes.this.mAnim);
                BrDialogPipes.this.dismissAllowingStateLoss();
            }
        });
        for (int i2 = 0; i2 < 23; i2++) {
            this.mPipes[i2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (BrDialogPipes.this.mResult) {
                        return;
                    }
                    view.startAnimation(BrDialogPipes.this.mAnim);
                    int i3 = 0;
                    for (int i4 = 0; i4 < 23; i4++) {
                        if (view == BrDialogPipes.this.mPipes[i4]) {
                            i3 = i4;
                        }
                    }
                    ImageView imageView = (ImageView) ((RelativeLayout) view).getChildAt(0);
                    int i5 = BrDialogPipes.this.mSelectedVar;
                    if (i5 != -1) {
                        if (i5 == 0 || i5 == 1) {
                            imageView.setVisibility(0);
                            if (BrDialogPipes.this.mSelectedVar == 0) {
                                imageView.setImageResource(R.drawable.img_pipes_direct);
                                imageView.setRotation(0.0f);
                                imageView.setScaleX(0.8f);
                                imageView.setScaleY(0.8f);
                                imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                                BrDialogPipes.this.mIsAngle[i3] = 0;
                            } else {
                                imageView.setImageResource(R.drawable.img_pipes_angle);
                                imageView.setRotation(0.0f);
                                imageView.setScaleX(0.5f);
                                imageView.setScaleY(0.5f);
                                imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                                BrDialogPipes.this.mIsAngle[i3] = 1;
                            }
                            BrDialogPipes.this.mTextHelp.setText(BrDialogPipes.this.mContext.getString(R.string.pipes_dialog_hint_3));
                            BrDialogPipes.this.mIsActive[i3] = true;
                            BrDialogPipes.this.mPipesVar[BrDialogPipes.this.mSelectedVar].setBackground(ContextCompat.getDrawable(BrDialogPipes.this.getContext(), R.drawable.bg_rectangle_gray10_cr10_t1_gray));
                            BrDialogPipes.this.mSelectedVar = -1;
                        }
                    } else if (BrDialogPipes.this.mIsActive[i3]) {
                        float rotation = imageView.getRotation() + 90.0f;
                        if (rotation >= 360.0f) {
                            rotation = 0.0f;
                        }
                        imageView.setRotation((rotation < 180.0f || BrDialogPipes.this.mIsAngle[i3] != 0) ? rotation : 0.0f);
                    }
                    BrDialogPipes.this.CheckPath();
                }
            });
            this.mPipes[i2].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogPipes.6
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    if (BrDialogPipes.this.mResult) {
                        return true;
                    }
                    view.startAnimation(BrDialogPipes.this.mAnim);
                    int i3 = 0;
                    for (int i4 = 0; i4 < 23; i4++) {
                        if (view == BrDialogPipes.this.mPipes[i4]) {
                            i3 = i4;
                        }
                    }
                    ((ImageView) ((RelativeLayout) view).getChildAt(0)).setVisibility(4);
                    BrDialogPipes.this.mIsActive[i3] = false;
                    return true;
                }
            });
        }
        return viewInflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mGUIManager = manager;
        show(activity.getSupportFragmentManager(), "dialog");
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        dismissAllowingStateLoss();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        if (getDialog() != null) {
            return getDialog().isShowing();
        }
        return false;
    }

    public void onPipesGuiClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            jSONObject.put("r", this.mResult);
            this.mGUIManager.sendJsonData(8, jSONObject);
        } catch (Exception unused) {
        }
    }
}
