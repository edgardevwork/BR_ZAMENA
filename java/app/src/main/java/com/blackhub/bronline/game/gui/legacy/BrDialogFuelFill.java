package com.blackhub.bronline.game.gui.legacy;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.common.CountAnimationTextView;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated

public class BrDialogFuelFill implements ISAMPGUI {
    public int mMaxFuel = 0;
    public int[] mPrices = null;
    public String mInitialHint = null;
    public GUIManager mGUIManager = null;
    public Button[] mButtons = null;
    public TextSwitcher mHint = null;
    public SeekBar mBar = null;
    public Button mButtonBuy = null;
    public ImageView mButtonClose = null;
    public TextView mLitres = null;
    public CountAnimationTextView mPrice = null;
    public int mSelectedFuel = 0;
    public Runnable mRunnableButtons = null;
    public PopupWindow mWindow = null;
    public View mView = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 2;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogFuelFill();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) throws JSONException {
        int i;
        try {
            i = json.getInt("t");
        } catch (Exception unused) {
            i = -1;
        }
        if (i != 0) {
            return;
        }
        try {
            this.mHint.setText(json.getString("h"));
            this.mInitialHint = json.getString("h");
        } catch (Exception unused2) {
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, final JNIActivity activity) {
        this.mGUIManager = manager;
        try {
            this.mMaxFuel = json.getInt("m");
            this.mPrices = new int[json.getJSONArray("ma").length()];
            this.mInitialHint = json.getString("h");
            for (int i = 0; i < json.getJSONArray("ma").length(); i++) {
                this.mPrices[i] = json.getJSONArray("ma").getInt(i);
            }
        } catch (Exception unused) {
        }
        if (this.mWindow == null) {
            this.mView = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.br_fuel_fill, (ViewGroup) null, false);
            PopupWindow popupWindow = new PopupWindow(this.mView, -2, -2, true);
            this.mWindow = popupWindow;
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            this.mWindow.setSoftInputMode(16);
            UsefulKt.setCustomTouchInterceptor(this.mWindow);
            this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.1
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                }
            });
        }
        this.mButtons = new Button[5];
        for (int i2 = 0; i2 < 5; i2++) {
            this.mButtons[i2] = (Button) this.mView.findViewById(activity.getResources().getIdentifier("br_fuel_fill_button_" + i2, "id", activity.getPackageName()));
            this.mButtons[i2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    view.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.button_click));
                    if (BrDialogFuelFill.this.mRunnableButtons != null) {
                        for (int i3 = 0; i3 < 5; i3++) {
                            BrDialogFuelFill.this.mButtons[i3].removeCallbacks(BrDialogFuelFill.this.mRunnableButtons);
                        }
                        BrDialogFuelFill.this.mRunnableButtons = null;
                    }
                    BrDialogFuelFill.this.mRunnableButtons = new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BrDialogFuelFill.this.mButtons[BrDialogFuelFill.this.mSelectedFuel].setBackground(ContextCompat.getDrawable(activity, R.drawable.bg_button_red_unfilled_ss));
                            BrDialogFuelFill.this.mRunnableButtons = null;
                        }
                    };
                    view.postDelayed(BrDialogFuelFill.this.mRunnableButtons, 200L);
                    int i4 = 0;
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (view == BrDialogFuelFill.this.mButtons[i5]) {
                            i4 = i5;
                        } else {
                            BrDialogFuelFill.this.mButtons[i5].setBackground(ContextCompat.getDrawable(activity, R.drawable.bg_button_gray));
                        }
                    }
                    int i6 = BrDialogFuelFill.this.mSelectedFuel;
                    BrDialogFuelFill.this.mSelectedFuel = i4;
                    BrDialogFuelFill.this.mPrice.setAnimationDuration(500L).setCountAnimationListener(new CountAnimationTextView.CountAnimationListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.2.2
                        @Override // com.blackhub.bronline.game.common.CountAnimationTextView.CountAnimationListener
                        public void onAnimationStart(Object animatedValue) {
                        }

                        @Override // com.blackhub.bronline.game.common.CountAnimationTextView.CountAnimationListener
                        public void onAnimationEnd(Object animatedValue) {
                            String string = BrDialogFuelFill.this.mPrice.getText().toString();
                            int i7 = 0;
                            while (true) {
                                try {
                                    if (i7 >= string.length()) {
                                        i7 = 0;
                                        break;
                                    } else if (string.charAt(i7) == ' ') {
                                        break;
                                    } else {
                                        i7++;
                                    }
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            if (Integer.parseInt(string.substring(0, i7)) != BrDialogFuelFill.this.mPrices[BrDialogFuelFill.this.mSelectedFuel] * BrDialogFuelFill.this.mBar.getProgress()) {
                                BrDialogFuelFill.this.mPrice.setText((BrDialogFuelFill.this.mPrices[BrDialogFuelFill.this.mSelectedFuel] * BrDialogFuelFill.this.mBar.getProgress()) + " р");
                            }
                        }
                    }).countAnimation(BrDialogFuelFill.this.mPrices[i6] * BrDialogFuelFill.this.mBar.getProgress(), BrDialogFuelFill.this.mPrices[BrDialogFuelFill.this.mSelectedFuel] * BrDialogFuelFill.this.mBar.getProgress());
                }
            });
        }
        this.mHint = (TextSwitcher) this.mView.findViewById(R.id.br_dialog_fuel_fill_hint);
        this.mBar = (SeekBar) this.mView.findViewById(R.id.br_fuel_fill_slider);
        this.mLitres = (TextView) this.mView.findViewById(R.id.br_fuel_fill_litres);
        this.mPrice = (CountAnimationTextView) this.mView.findViewById(R.id.br_fuel_fill_price);
        this.mButtonBuy = (Button) this.mView.findViewById(R.id.br_fuel_fill_buy);
        ImageView imageView = (ImageView) this.mView.findViewById(R.id.br_dialog_fuel_fill_close);
        this.mButtonClose = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.button_click));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("t", 1);
                    BrDialogFuelFill.this.mGUIManager.sendJsonData(2, jSONObject);
                } catch (Exception unused2) {
                }
                BrDialogFuelFill.this.mGUIManager.closeGUI(null, 2);
            }
        });
        this.mButtonBuy.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.button_click));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 0);
                    jSONObject.put("v", BrDialogFuelFill.this.mBar.getProgress());
                    jSONObject.put("f", BrDialogFuelFill.this.mSelectedFuel);
                } catch (Exception unused2) {
                }
                BrDialogFuelFill.this.mGUIManager.sendJsonData(2, jSONObject);
            }
        });
        this.mButtons[0].setText(Html.fromHtml("<b><big>АИ-92</big></><br><small>" + this.mPrices[0] + " р/литр</small>"));
        this.mButtons[1].setText(Html.fromHtml("<b><big>АИ-95</big></><br><small>" + this.mPrices[1] + " р/литр</small>"));
        this.mButtons[2].setText(Html.fromHtml("<b><big>АИ-98</big></><br><small>" + this.mPrices[2] + " р/литр</small>"));
        this.mButtons[3].setText(Html.fromHtml("<b><big>АИ-100</big></><br><small>" + this.mPrices[3] + " р/литр</small>"));
        this.mButtons[4].setText(Html.fromHtml("<b><big>ДТ</big></><br><small>" + this.mPrices[4] + " р/литр</small>"));
        this.mSelectedFuel = 0;
        this.mButtons[0].setBackground(ContextCompat.getDrawable(activity, R.drawable.bg_button_red_unfilled_ss));
        this.mHint.setInAnimation(activity, R.anim.slide_in_vertical);
        this.mHint.setOutAnimation(activity, R.anim.slide_out_vertical);
        this.mHint.setCurrentText(this.mInitialHint);
        this.mBar.setMax(this.mMaxFuel);
        this.mBar.setProgress(this.mMaxFuel);
        this.mLitres.setText(this.mMaxFuel + " л");
        this.mPrice.setText((this.mPrices[this.mSelectedFuel] * this.mMaxFuel) + " р");
        this.mPrice.setDecimalFormat(new DecimalFormat("# р"));
        this.mBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrDialogFuelFill.5
            public int mRemembered = 0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i3, boolean b) {
                BrDialogFuelFill.this.mLitres.setText(i3 + " л");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                this.mRemembered = seekBar.getProgress();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                BrDialogFuelFill.this.mPrice.setAnimationDuration(500L).countAnimation(this.mRemembered, BrDialogFuelFill.this.mPrices[BrDialogFuelFill.this.mSelectedFuel] * seekBar.getProgress());
            }
        });
        this.mWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
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
