package com.blackhub.bronline.game.gui.legacy;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
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
public class BrDialogDiner extends DialogFragment implements ISAMPGUI {
    public LinearLayout[] mEatsLinears;
    public boolean[] mEatsSelected;
    public TextView mPriceSumText;
    public RelativeLayout mPurchaseLayout;
    public JNIActivity mContext = null;
    public int[] mEatsPrice = {120, 230, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, 580, 80, 30};
    public int[] mEatsSatiety = {5, 10, 15, 20, 3, 2};
    public int mPriceSum = 0;
    public int mMoney = 0;
    public boolean mPurchased = false;
    public GUIManager mGUIManager = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 3;
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogDiner();
    }

    public final void UpdatePriceSum() {
        this.mPriceSum = 0;
        for (int i = 0; i < 6; i++) {
            if (this.mEatsSelected[i]) {
                this.mPriceSum += this.mEatsPrice[i];
            }
        }
        this.mPriceSumText.setText(requireContext().getString(R.string.dinner_all_price, Integer.valueOf(this.mPriceSum)));
        int i2 = this.mPriceSum;
        if (i2 != 0 && this.mMoney >= i2) {
            this.mPurchaseLayout.setAlpha(1.0f);
        } else {
            this.mPurchaseLayout.setAlpha(0.5f);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) throws JSONException {
        if (!this.mPurchased) {
            onDinerGuiClosed();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.br_diner, (ViewGroup) null, false);
        this.mContext = (JNIActivity) getActivity();
        getDialog().getWindow().setDimAmount(0.0f);
        getDialog().getWindow().getDecorView().getBackground().setAlpha(0);
        ((Button) viewInflate.findViewById(R.id.close_button)).setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BrDialogDiner.this.dismissAllowingStateLoss();
                return false;
            }
        });
        this.mEatsSelected = new boolean[6];
        this.mPriceSumText = (TextView) viewInflate.findViewById(R.id.br_diner_price_sum);
        this.mPurchaseLayout = (RelativeLayout) viewInflate.findViewById(R.id.br_diner_purchace_button);
        UpdatePriceSum();
        this.mPurchaseLayout.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (view.getAlpha() >= 1.0f) {
                    BrDialogDiner.this.mPurchased = true;
                    int i = 0;
                    for (int i2 = 0; i2 < 6; i2++) {
                        if (BrDialogDiner.this.mEatsSelected[i2]) {
                            i |= 1 << i2;
                        }
                    }
                    BrDialogDiner.this.onDinerGuiPurchased(i);
                    BrDialogDiner.this.dismissAllowingStateLoss();
                }
            }
        });
        TextView[] textViewArr = {(TextView) viewInflate.findViewById(R.id.br_diner_price_0), (TextView) viewInflate.findViewById(R.id.br_diner_price_1), (TextView) viewInflate.findViewById(R.id.br_diner_price_2), (TextView) viewInflate.findViewById(R.id.br_diner_price_3), (TextView) viewInflate.findViewById(R.id.br_diner_price_4), (TextView) viewInflate.findViewById(R.id.br_diner_price_5)};
        TextView[] textViewArr2 = {(TextView) viewInflate.findViewById(R.id.br_diner_satiety_0), (TextView) viewInflate.findViewById(R.id.br_diner_satiety_1), (TextView) viewInflate.findViewById(R.id.br_diner_satiety_2), (TextView) viewInflate.findViewById(R.id.br_diner_satiety_3), (TextView) viewInflate.findViewById(R.id.br_diner_satiety_4), (TextView) viewInflate.findViewById(R.id.br_diner_satiety_5)};
        for (int i = 0; i < 6; i++) {
            textViewArr[i].setText(this.mContext.getString(R.string.dinner_title_food_price, Integer.valueOf(this.mEatsPrice[i])));
            textViewArr2[i].setText(this.mContext.getString(R.string.dinner_title_food_satiety, Integer.valueOf(this.mEatsSatiety[i])));
        }
        LinearLayout[] linearLayoutArr = new LinearLayout[6];
        this.mEatsLinears = linearLayoutArr;
        linearLayoutArr[0] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_hotdog);
        this.mEatsLinears[1] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_cheburek);
        this.mEatsLinears[2] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_pie);
        this.mEatsLinears[3] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_sausage);
        this.mEatsLinears[4] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_coffee);
        this.mEatsLinears[5] = (LinearLayout) viewInflate.findViewById(R.id.br_diner_tea);
        this.mEatsLinears[0].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[0]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[0] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[0] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        this.mEatsLinears[1].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[1]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[1] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[1] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        this.mEatsLinears[2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[2]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[2] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[2] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        this.mEatsLinears[3].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[3]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[3] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[3] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        this.mEatsLinears[4].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[4]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[4] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[4] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        this.mEatsLinears[5].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogDiner.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!BrDialogDiner.this.mEatsSelected[5]) {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogDiner.this.mEatsSelected[5] = true;
                } else {
                    view.setBackground(ContextCompat.getDrawable(BrDialogDiner.this.getContext(), R.drawable.bg_button_gray));
                    BrDialogDiner.this.mEatsSelected[5] = false;
                }
                BrDialogDiner.this.UpdatePriceSum();
            }
        });
        return viewInflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mGUIManager = manager;
        show(activity.getSupportFragmentManager(), "dialog");
        try {
            this.mMoney = json.getInt("m");
        } catch (Exception unused) {
        }
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

    public void onDinerGuiClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            this.mGUIManager.sendJsonData(3, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onDinerGuiPurchased(int order) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("r", order);
            this.mGUIManager.sendJsonData(3, jSONObject);
        } catch (Exception unused) {
        }
    }
}
