package com.blackhub.bronline.game.gui.legacy;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public class BrDialogRobbery extends DialogFragment implements ISAMPGUI {
    public ImageView mBagImage;
    public TextView mHintText;
    public TextView mPriceText;
    public TextView mSafeText;
    public JNIActivity mContext = null;
    public int mMoney = 0;
    public int mSafeMoney = 0;
    public int mBagMoney = 0;
    public int mEmptyCells = 0;
    public ImageView[] mMoneyImg = new ImageView[12];
    public FrameLayout[] mCells = new FrameLayout[12];
    public int mSelected = -1;
    public GUIManager mGUIManager = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 5;
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
        return new BrDialogRobbery();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) throws JSONException {
        onRobberyGuiClosed();
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
        View viewInflate = inflater.inflate(R.layout.br_robbery, (ViewGroup) null, false);
        this.mContext = (JNIActivity) getContext();
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setDimAmount(0.0f);
        getDialog().getWindow().setLayout(-1, -1);
        this.mBagMoney = 0;
        this.mEmptyCells = 0;
        this.mHintText = (TextView) viewInflate.findViewById(R.id.br_robbery_hint);
        this.mPriceText = (TextView) viewInflate.findViewById(R.id.br_robbery_price);
        this.mSafeText = (TextView) viewInflate.findViewById(R.id.br_robbery_safe);
        this.mBagImage = (ImageView) viewInflate.findViewById(R.id.br_robbery_bag);
        this.mMoneyImg[0] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_0);
        this.mMoneyImg[1] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_1);
        this.mMoneyImg[2] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_2);
        this.mMoneyImg[3] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_3);
        this.mMoneyImg[4] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_4);
        this.mMoneyImg[5] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_5);
        this.mMoneyImg[6] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_6);
        this.mMoneyImg[7] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_7);
        this.mMoneyImg[8] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_8);
        this.mMoneyImg[9] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_9);
        this.mMoneyImg[10] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_10);
        this.mMoneyImg[11] = (ImageView) viewInflate.findViewById(R.id.br_robbery_money_11);
        this.mCells[0] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_0);
        this.mCells[1] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_1);
        this.mCells[2] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_2);
        this.mCells[3] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_3);
        this.mCells[4] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_4);
        this.mCells[5] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_5);
        this.mCells[6] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_6);
        this.mCells[7] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_7);
        this.mCells[8] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_8);
        this.mCells[9] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_9);
        this.mCells[10] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_10);
        this.mCells[11] = (FrameLayout) viewInflate.findViewById(R.id.br_robbery_cell_11);
        this.mPriceText.setText(String.format("%,.0f Р", Float.valueOf(this.mBagMoney)));
        this.mSafeText.setText(String.format("%,.0f Р", Float.valueOf(this.mSafeMoney)));
        ((ImageView) viewInflate.findViewById(R.id.br_robbery_close)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrDialogRobbery.this.dismissAllowingStateLoss();
            }
        });
        this.mBagImage.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mMoneyImg[BrDialogRobbery.this.mSelected].setVisibility(4);
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                    BrDialogRobbery brDialogRobbery = BrDialogRobbery.this;
                    int i = brDialogRobbery.mEmptyCells + 1;
                    brDialogRobbery.mEmptyCells = i;
                    if (i < 12) {
                        BrDialogRobbery.this.mSafeMoney -= BrDialogRobbery.this.mMoney / 12;
                        BrDialogRobbery.this.mBagMoney += BrDialogRobbery.this.mMoney / 12;
                    } else {
                        BrDialogRobbery.this.mSafeMoney = 0;
                        BrDialogRobbery brDialogRobbery2 = BrDialogRobbery.this;
                        brDialogRobbery2.mBagMoney = brDialogRobbery2.mMoney;
                        BrDialogRobbery.this.mBagImage.setImageResource(R.drawable.img_bag_with_money_3);
                        BrDialogRobbery.this.mHintText.setText(R.string.robbery_dialog_hint_1);
                    }
                    BrDialogRobbery.this.mPriceText.setText(String.format("%,.0f Р", Float.valueOf(BrDialogRobbery.this.mBagMoney)));
                    BrDialogRobbery.this.mSafeText.setText(String.format("%,.0f Р", Float.valueOf(BrDialogRobbery.this.mSafeMoney)));
                    if (BrDialogRobbery.this.mEmptyCells == 1) {
                        BrDialogRobbery.this.mHintText.setText(R.string.robbery_dialog_hint_2);
                    }
                    if (BrDialogRobbery.this.mEmptyCells == 6) {
                        BrDialogRobbery.this.mBagImage.setImageResource(R.drawable.img_bag_with_money_2);
                    }
                    BrDialogRobbery.this.mSelected = -1;
                }
            }
        });
        this.mCells[0].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 0 || !BrDialogRobbery.this.mMoneyImg[0].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[0].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 0;
            }
        });
        this.mCells[1].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 1 || !BrDialogRobbery.this.mMoneyImg[1].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[1].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 1;
            }
        });
        this.mCells[2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 2 || !BrDialogRobbery.this.mMoneyImg[2].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[2].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 2;
            }
        });
        this.mCells[3].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 3 || !BrDialogRobbery.this.mMoneyImg[3].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[3].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 3;
            }
        });
        this.mCells[4].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 4 || !BrDialogRobbery.this.mMoneyImg[4].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[4].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 4;
            }
        });
        this.mCells[5].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 5 || !BrDialogRobbery.this.mMoneyImg[5].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[5].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 5;
            }
        });
        this.mCells[6].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 6 || !BrDialogRobbery.this.mMoneyImg[6].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[6].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 6;
            }
        });
        this.mCells[7].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 7 || !BrDialogRobbery.this.mMoneyImg[7].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[7].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 7;
            }
        });
        this.mCells[8].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 8 || !BrDialogRobbery.this.mMoneyImg[8].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[8].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 8;
            }
        });
        this.mCells[9].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 9 || !BrDialogRobbery.this.mMoneyImg[9].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[9].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 9;
            }
        });
        this.mCells[10].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 10 || !BrDialogRobbery.this.mMoneyImg[10].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[10].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 10;
            }
        });
        this.mCells[11].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogRobbery.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BrDialogRobbery.this.mSelected == 11 || !BrDialogRobbery.this.mMoneyImg[11].isShown()) {
                    return;
                }
                if (BrDialogRobbery.this.mSelected != -1) {
                    BrDialogRobbery.this.mCells[BrDialogRobbery.this.mSelected].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10));
                }
                BrDialogRobbery.this.mCells[11].setBackground(ContextCompat.getDrawable(BrDialogRobbery.this.getContext(), R.drawable.bg_rectangle_black37_dgr_cr10_t1_orange));
                BrDialogRobbery.this.mSelected = 11;
            }
        });
        return viewInflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) throws JSONException {
        this.mGUIManager = manager;
        show(activity.getSupportFragmentManager(), "dialog");
        try {
            int i = json.getInt("m");
            this.mSafeMoney = i;
            this.mMoney = i;
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

    public void onRobberyGuiClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            jSONObject.put("s", this.mBagMoney);
            this.mGUIManager.sendJsonData(5, jSONObject);
        } catch (Exception unused) {
        }
    }
}
