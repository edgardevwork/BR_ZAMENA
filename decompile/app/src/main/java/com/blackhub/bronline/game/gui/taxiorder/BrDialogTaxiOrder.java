package com.blackhub.bronline.game.gui.taxiorder;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class BrDialogTaxiOrder implements ISAMPGUI {
    public float PosX;
    public float PosY;
    public Button SendB;
    public Button mChangeEnd;
    public EditText mComment;
    public GUIManager mGUIManager;
    public JNIActivity mContext = null;
    public PopupWindow mWindow = null;
    public View mRootView = null;
    public PopupWindow mMapWindow = null;
    public View mMapView = null;
    public PopupWindow mWaitWindow = null;
    public View mWaitView = null;
    public PopupWindow mCommWindow = null;
    public View mCommView = null;
    public Animation anim = null;
    public boolean mClosed = true;
    public boolean mByCard = false;
    public int mAgrSelected = 0;
    public int mPriceSelected = 0;
    public int mPlayerMoney = 0;
    public int mPlayerCard = 0;
    public int[] mPrices = new int[9];
    public int[] mActivePrices = new int[9];
    public LinearLayout[] Prices = new LinearLayout[3];
    public float TempX = -20000.0f;
    public float TempY = -20000.0f;
    public float DestX = -20000.0f;
    public float DestY = -20000.0f;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 17;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogTaxiOrder();
    }

    public final void MapStuff() {
        final ImageView imageView = (ImageView) this.mMapView.findViewById(R.id.br_taxi_map_dest);
        this.mMapView.findViewById(R.id.br_taxi_map_exit).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(BrDialogTaxiOrder.this.anim);
                new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BrDialogTaxiOrder.this.mMapWindow.dismiss();
                    }
                }, 400L);
            }
        });
        this.mMapView.findViewById(R.id.br_taxi_map_map).setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (x < IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext)) {
                        x = IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext);
                    }
                    if (y < IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext)) {
                        y = IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext);
                    }
                    if (x > view.getWidth() - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext)) {
                        x = view.getWidth() - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext);
                    }
                    if (y > view.getHeight() - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext)) {
                        y = view.getHeight() - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(IntExtensionKt.dpToPx(16, BrDialogTaxiOrder.this.mContext), IntExtensionKt.dpToPx(16, BrDialogTaxiOrder.this.mContext));
                    layoutParams.setMargins(x - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext), y - IntExtensionKt.dpToPx(8, BrDialogTaxiOrder.this.mContext), 0, 0);
                    imageView.setLayoutParams(layoutParams);
                    imageView.setVisibility(0);
                    BrDialogTaxiOrder.this.mMapView.findViewById(R.id.br_taxi_map_select).setAlpha(1.0f);
                    BrDialogTaxiOrder brDialogTaxiOrder = BrDialogTaxiOrder.this;
                    float f = x;
                    brDialogTaxiOrder.TempX = f;
                    brDialogTaxiOrder.TempY = y;
                    brDialogTaxiOrder.TempX = f - (view.getWidth() / 2.0f);
                    BrDialogTaxiOrder.this.TempY -= view.getHeight() / 2.0f;
                    BrDialogTaxiOrder.this.TempX *= 6000.0f / view.getWidth();
                    BrDialogTaxiOrder brDialogTaxiOrder2 = BrDialogTaxiOrder.this;
                    brDialogTaxiOrder2.TempY = brDialogTaxiOrder2.TempY * (6000.0f / view.getHeight()) * (-1.0f);
                }
                return true;
            }
        });
        this.mMapView.findViewById(R.id.br_taxi_map_select).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(BrDialogTaxiOrder.this.anim);
                new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.3.1
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        BrDialogTaxiOrder brDialogTaxiOrder = BrDialogTaxiOrder.this;
                        brDialogTaxiOrder.DestX = brDialogTaxiOrder.TempX;
                        brDialogTaxiOrder.DestY = brDialogTaxiOrder.TempY;
                        double dPow = Math.pow(r1 - brDialogTaxiOrder.PosX, 2.0d);
                        BrDialogTaxiOrder brDialogTaxiOrder2 = BrDialogTaxiOrder.this;
                        float fSqrt = ((float) Math.sqrt(dPow + Math.pow(brDialogTaxiOrder2.DestY - brDialogTaxiOrder2.PosY, 2.0d))) / 1000.0f;
                        for (int i = 0; i < 9; i++) {
                            BrDialogTaxiOrder.this.mActivePrices[i] = (int) ((3.0f + fSqrt) * BrDialogTaxiOrder.this.mPrices[i]);
                        }
                        for (int i2 = 0; i2 < 3; i2++) {
                            ((TextView) BrDialogTaxiOrder.this.Prices[i2].getChildAt(1)).setText(String.format("%,.0f ₽", Float.valueOf(BrDialogTaxiOrder.this.mActivePrices[(BrDialogTaxiOrder.this.mAgrSelected * 3) + i2])));
                        }
                        if ((!BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerCard >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)]) && (BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerMoney >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)])) {
                            BrDialogTaxiOrder brDialogTaxiOrder3 = BrDialogTaxiOrder.this;
                            if (brDialogTaxiOrder3.DestX > -20000.0f) {
                                brDialogTaxiOrder3.SendB.setAlpha(1.0f);
                            } else {
                                BrDialogTaxiOrder.this.SendB.setAlpha(0.5f);
                            }
                        }
                        BrDialogTaxiOrder.this.mChangeEnd.setBackground(ContextCompat.getDrawable(BrDialogTaxiOrder.this.mContext, R.drawable.bg_button_red_unfilled));
                        BrDialogTaxiOrder.this.mChangeEnd.setText(R.string.common_change);
                        BrDialogTaxiOrder.this.mMapWindow.dismiss();
                    }
                }, 400L);
            }
        });
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, final JNIActivity activity) throws JSONException {
        this.mContext = activity;
        this.mGUIManager = manager;
        if (this.mWindow == null) {
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            this.mRootView = layoutInflater.inflate(R.layout.br_taxi_order, (ViewGroup) null, false);
            PopupWindow popupWindow = new PopupWindow(this.mRootView, -1, -1, true);
            this.mWindow = popupWindow;
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mWindow.setSoftInputMode(16);
            UsefulKt.setCustomTouchInterceptor(this.mWindow);
            this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.4
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() throws JSONException {
                    if (BrDialogTaxiOrder.this.mClosed) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("t", -1);
                            BrDialogTaxiOrder.this.mGUIManager.sendJsonData(17, jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    BrDialogTaxiOrder.this.mMapWindow.dismiss();
                    BrDialogTaxiOrder.this.mWaitWindow.dismiss();
                    BrDialogTaxiOrder.this.mGUIManager.closeGUI(null, 17);
                }
            });
            this.mMapView = layoutInflater.inflate(R.layout.fragment_taxi_map, (ViewGroup) null, false);
            PopupWindow popupWindow2 = new PopupWindow(this.mMapView, -1, -1, true);
            this.mMapWindow = popupWindow2;
            popupWindow2.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mMapWindow.setSoftInputMode(16);
            this.mWaitView = layoutInflater.inflate(R.layout.br_taxi_wait, (ViewGroup) null, false);
            PopupWindow popupWindow3 = new PopupWindow(this.mWaitView, -2, -2, true);
            this.mWaitWindow = popupWindow3;
            popupWindow3.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mWaitWindow.setSoftInputMode(16);
            this.mWaitWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.5
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() throws JSONException {
                    if (BrDialogTaxiOrder.this.mClosed) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("t", 1);
                            BrDialogTaxiOrder.this.mGUIManager.sendJsonData(17, jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            this.mWaitView.findViewById(R.id.br_taxi_wait_close).setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    view.startAnimation(BrDialogTaxiOrder.this.anim);
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BrDialogTaxiOrder.this.mWaitWindow.dismiss();
                        }
                    }, 400L);
                    return true;
                }
            });
            this.mCommView = layoutInflater.inflate(R.layout.br_taxi_comment, (ViewGroup) null, false);
            PopupWindow popupWindow4 = new PopupWindow(this.mCommView, -2, -2, true);
            this.mCommWindow = popupWindow4;
            popupWindow4.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mCommWindow.setSoftInputMode(16);
            this.mCommWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.7
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    BrDialogTaxiOrder.this.mWindow.dismiss();
                }
            });
            this.mCommView.findViewById(R.id.br_taxi_comment_close).setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.8
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    view.startAnimation(BrDialogTaxiOrder.this.anim);
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BrDialogTaxiOrder.this.mCommWindow.dismiss();
                        }
                    }, 400L);
                    return true;
                }
            });
            MapStuff();
            this.mRootView.findViewById(R.id.br_taxi_order_close).setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.9
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    view.startAnimation(BrDialogTaxiOrder.this.anim);
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BrDialogTaxiOrder.this.mWindow.dismiss();
                        }
                    }, 400L);
                    return true;
                }
            });
        }
        this.mContext = activity;
        this.anim = AnimationUtils.loadAnimation(activity, R.anim.button_click);
        final FrameLayout[] frameLayoutArr = {(FrameLayout) this.mRootView.findViewById(R.id.br_taxi_order_yandex), (FrameLayout) this.mRootView.findViewById(R.id.br_taxi_order_city), (FrameLayout) this.mRootView.findViewById(R.id.br_taxi_order_gett)};
        this.Prices[0] = (LinearLayout) this.mRootView.findViewById(R.id.br_taxi_order_econom);
        this.Prices[1] = (LinearLayout) this.mRootView.findViewById(R.id.br_taxi_order_comfotable);
        this.Prices[2] = (LinearLayout) this.mRootView.findViewById(R.id.br_taxi_order_business);
        this.SendB = (Button) this.mRootView.findViewById(R.id.br_taxi_order_send);
        this.mComment = (EditText) this.mRootView.findViewById(R.id.br_taxi_order_comm);
        Switch r2 = (Switch) this.mRootView.findViewById(R.id.br_taxi_order_check);
        final ImageView imageView = (ImageView) this.mRootView.findViewById(R.id.br_taxi_order_money);
        final ImageView imageView2 = (ImageView) this.mRootView.findViewById(R.id.br_taxi_order_card);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                BrDialogTaxiOrder.this.mByCard = b;
                if (b) {
                    Drawable drawable = imageView.getDrawable();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(-11513776, mode);
                    imageView2.getDrawable().setColorFilter(-1, mode);
                } else {
                    Drawable drawable2 = imageView.getDrawable();
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    drawable2.setColorFilter(-1, mode2);
                    imageView2.getDrawable().setColorFilter(-11513776, mode2);
                }
                if ((!BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerCard >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)]) && (BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerMoney >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)])) {
                    BrDialogTaxiOrder brDialogTaxiOrder = BrDialogTaxiOrder.this;
                    if (brDialogTaxiOrder.DestX > -20000.0f) {
                        brDialogTaxiOrder.SendB.setAlpha(1.0f);
                        return;
                    }
                }
                BrDialogTaxiOrder.this.SendB.setAlpha(0.5f);
            }
        });
        Button button = (Button) this.mRootView.findViewById(R.id.br_taxi_order_end_butt);
        this.mChangeEnd = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(BrDialogTaxiOrder.this.anim);
                new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.11.1
                    @Override // java.lang.Runnable
                    public void run() throws JSONException {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("t", 2);
                            BrDialogTaxiOrder.this.mGUIManager.sendJsonData(17, jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 400L);
            }
        });
        final TextView[] textViewArr = {(TextView) this.mRootView.findViewById(R.id.br_taxi_text_yandex), (TextView) this.mRootView.findViewById(R.id.br_taxi_text_city), (TextView) this.mRootView.findViewById(R.id.br_taxi_text_gett)};
        try {
            ((TextView) this.mRootView.findViewById(R.id.br_taxi_order_start)).setText(this.mContext.getString(R.string.taxi_your_address, json.getString("pl")));
            this.mPlayerMoney = json.getInt("m");
            this.mPlayerCard = json.getInt("ca");
            for (int i = 0; i < 9; i++) {
                int[] iArr = this.mActivePrices;
                int[] iArr2 = this.mPrices;
                int i2 = json.getJSONArray("p").getInt(i);
                iArr2[i] = i2;
                iArr[i] = i2;
            }
            this.PosX = json.getInt("x");
            this.PosY = json.getInt("y");
            int i3 = 0;
            while (i3 < 3) {
                textViewArr[i3].setVisibility(4);
                frameLayoutArr[i3].setBackground(ContextCompat.getDrawable(this.mContext, i3 == 0 ? R.drawable.bg_rectangle_orange_hgr_cr4_1 : R.drawable.bg_rectangle_black53_cr4));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayoutArr[i3].getLayoutParams();
                layoutParams.width = IntExtensionKt.dpToPx(120, this.mContext);
                layoutParams.height = IntExtensionKt.dpToPx(50, this.mContext);
                layoutParams.topMargin = IntExtensionKt.dpToPx(10, this.mContext);
                layoutParams.rightMargin = IntExtensionKt.dpToPx(15, this.mContext);
                frameLayoutArr[i3].setLayoutParams(layoutParams);
                if (i3 == json.getInt("f") || i3 == json.getInt("s")) {
                    textViewArr[i3].setVisibility(0);
                    if (i3 == json.getInt("s")) {
                        textViewArr[i3].setText(R.string.taxi_increased_demand);
                    } else {
                        textViewArr[i3].setText(R.string.taxi_the_fastest);
                    }
                    frameLayoutArr[i3].setBackground(ContextCompat.getDrawable(this.mContext, i3 == 0 ? R.drawable.ic_taxi_element_active : R.drawable.ic_taxi_element_inactive));
                    layoutParams.width = IntExtensionKt.dpToPx(130, this.mContext);
                    layoutParams.height = IntExtensionKt.dpToPx(60, this.mContext);
                    layoutParams.rightMargin = IntExtensionKt.dpToPx(5, this.mContext);
                    layoutParams.topMargin = 0;
                    frameLayoutArr[i3].setLayoutParams(layoutParams);
                }
                i3++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i4 = 0; i4 < 3; i4++) {
            frameLayoutArr[i4].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.12
                /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    view.startAnimation(BrDialogTaxiOrder.this.anim);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 3) {
                            i5 = -1;
                            break;
                        } else if (view == frameLayoutArr[i5]) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    frameLayoutArr[BrDialogTaxiOrder.this.mAgrSelected].setBackground(ContextCompat.getDrawable(BrDialogTaxiOrder.this.mContext, textViewArr[BrDialogTaxiOrder.this.mAgrSelected].getVisibility() == 0 ? R.drawable.ic_taxi_element_inactive : R.drawable.bg_rectangle_black53_cr4));
                    frameLayoutArr[i5].setBackground(ContextCompat.getDrawable(BrDialogTaxiOrder.this.mContext, textViewArr[i5].getVisibility() == 0 ? R.drawable.ic_taxi_element_active : R.drawable.bg_rectangle_orange_hgr_cr4_1));
                    BrDialogTaxiOrder.this.mAgrSelected = i5;
                    if ((!BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerCard >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)]) && (BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerMoney >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)])) {
                        BrDialogTaxiOrder brDialogTaxiOrder = BrDialogTaxiOrder.this;
                        if (brDialogTaxiOrder.DestX > -20000.0f) {
                            brDialogTaxiOrder.SendB.setAlpha(1.0f);
                        } else {
                            BrDialogTaxiOrder.this.SendB.setAlpha(0.5f);
                        }
                    }
                    for (int i6 = 0; i6 < 3; i6++) {
                        ((TextView) BrDialogTaxiOrder.this.Prices[i6].getChildAt(1)).setText(String.format("%,.0f ₽", Float.valueOf(BrDialogTaxiOrder.this.mActivePrices[(BrDialogTaxiOrder.this.mAgrSelected * 3) + i6])));
                    }
                }
            });
            this.Prices[i4].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    view.startAnimation(BrDialogTaxiOrder.this.anim);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 3) {
                            i5 = -1;
                            break;
                        } else if (view == BrDialogTaxiOrder.this.Prices[i5]) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    BrDialogTaxiOrder brDialogTaxiOrder = BrDialogTaxiOrder.this;
                    brDialogTaxiOrder.Prices[brDialogTaxiOrder.mPriceSelected].setBackground(ContextCompat.getDrawable(BrDialogTaxiOrder.this.mContext, R.drawable.bg_rectangle_black53_cr4));
                    BrDialogTaxiOrder brDialogTaxiOrder2 = BrDialogTaxiOrder.this;
                    brDialogTaxiOrder2.Prices[i5].setBackground(ContextCompat.getDrawable(brDialogTaxiOrder2.mContext, R.drawable.bg_rectangle_black50_cr5_t1_orange));
                    BrDialogTaxiOrder.this.mPriceSelected = i5;
                    if ((!BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerCard >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)]) && (BrDialogTaxiOrder.this.mByCard || BrDialogTaxiOrder.this.mPlayerMoney >= BrDialogTaxiOrder.this.mActivePrices[BrDialogTaxiOrder.this.mPriceSelected + (BrDialogTaxiOrder.this.mAgrSelected * 3)])) {
                        BrDialogTaxiOrder brDialogTaxiOrder3 = BrDialogTaxiOrder.this;
                        if (brDialogTaxiOrder3.DestX > -20000.0f) {
                            brDialogTaxiOrder3.SendB.setAlpha(1.0f);
                            return;
                        }
                    }
                    BrDialogTaxiOrder.this.SendB.setAlpha(0.5f);
                }
            });
        }
        this.SendB.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(BrDialogTaxiOrder.this.anim);
                new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.taxiorder.BrDialogTaxiOrder.14.1
                    @Override // java.lang.Runnable
                    public void run() throws JSONException {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("t", 0);
                            jSONObject.put("x", BrDialogTaxiOrder.this.DestX);
                            jSONObject.put("y", BrDialogTaxiOrder.this.DestY);
                            jSONObject.put("a", BrDialogTaxiOrder.this.mAgrSelected);
                            jSONObject.put("p", BrDialogTaxiOrder.this.mPriceSelected);
                            jSONObject.put("m", !BrDialogTaxiOrder.this.mByCard ? 1 : 0);
                            jSONObject.put("ma", BrDialogTaxiOrder.this.mActivePrices[(BrDialogTaxiOrder.this.mAgrSelected * 3) + BrDialogTaxiOrder.this.mPriceSelected]);
                            jSONObject.put("co", BrDialogTaxiOrder.this.mComment.getText().toString());
                            BrDialogTaxiOrder.this.mGUIManager.sendJsonData(17, jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        BrDialogTaxiOrder.this.mWaitWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
                    }
                }, 400L);
            }
        });
        boolean z = this.mByCard;
        if ((!z || this.mPlayerCard >= this.mActivePrices[this.mPriceSelected + (this.mAgrSelected * 3)]) && ((z || this.mPlayerMoney >= this.mActivePrices[this.mPriceSelected + (this.mAgrSelected * 3)]) && this.DestX > -20000.0f)) {
            this.SendB.setAlpha(1.0f);
        } else {
            this.SendB.setAlpha(0.5f);
        }
        for (int i5 = 0; i5 < 3; i5++) {
            ((TextView) this.Prices[i5].getChildAt(1)).setText(String.format("%,.0f ₽", Float.valueOf(this.mActivePrices[(this.mAgrSelected * 3) + i5])));
        }
        imageView2.getDrawable().setColorFilter(-11513776, PorterDuff.Mode.MULTIPLY);
        this.mWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) throws JSONException {
        try {
            int i = json.getInt("t");
            if (i == 0) {
                this.mClosed = false;
                this.mWaitWindow.dismiss();
                ((TextView) this.mCommView.findViewById(R.id.br_taxi_comment_title)).setText(R.string.taxi_car_found);
                ((TextView) this.mCommView.findViewById(R.id.br_taxi_comment_comm)).setGravity(2);
                ((TextView) this.mCommView.findViewById(R.id.br_taxi_comment_comm)).setPadding(IntExtensionKt.dpToPx(20, this.mContext), 0, 0, 0);
                ((TextView) this.mCommView.findViewById(R.id.br_taxi_comment_comm)).setText(this.mContext.getString(R.string.taxi_info_about_order, json.getString("n"), json.getString(TaxiOrderKeys.NUMBER_KEY), json.getString("a")));
                Vibrator vibrator = (Vibrator) this.mContext.getSystemService("vibrator");
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(300L);
                }
                this.mCommWindow.showAtLocation(this.mContext.getParentLayout(), 17, 0, 0);
                return;
            }
            if (i == 1) {
                this.mMapWindow.showAtLocation(this.mContext.getParentLayout(), 17, 0, 0);
                return;
            }
            if (i != 2) {
                return;
            }
            this.DestX = (float) json.getDouble("x");
            this.DestY = (float) json.getDouble("y");
            float fSqrt = ((float) Math.sqrt(Math.pow(this.DestX - this.PosX, 2.0d) + Math.pow(this.DestY - this.PosY, 2.0d))) / 1000.0f;
            for (int i2 = 0; i2 < 9; i2++) {
                this.mActivePrices[i2] = (int) ((3.0f + fSqrt) * this.mPrices[i2]);
            }
            for (int i3 = 0; i3 < 3; i3++) {
                ((TextView) this.Prices[i3].getChildAt(1)).setText(String.format("%,.0f ₽", Float.valueOf(this.mActivePrices[(this.mAgrSelected * 3) + i3])));
            }
            boolean z = this.mByCard;
            if ((!z || this.mPlayerCard >= this.mActivePrices[this.mPriceSelected + (this.mAgrSelected * 3)]) && ((z || this.mPlayerMoney >= this.mActivePrices[this.mPriceSelected + (this.mAgrSelected * 3)]) && this.DestX > -20000.0f)) {
                this.SendB.setAlpha(1.0f);
            } else {
                this.SendB.setAlpha(0.5f);
            }
            this.mChangeEnd.setBackground(ContextCompat.getDrawable(this.mContext, R.drawable.bg_button_red_unfilled));
            this.mChangeEnd.setText(R.string.common_change);
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
