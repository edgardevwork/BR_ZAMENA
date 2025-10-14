package com.blackhub.bronline.game.gui.legacy;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BrNewCaptcha implements ISAMPGUI {
    public static boolean mIsShowing;
    public String CaptchaURL;
    public boolean dontSend;
    public DownloadImageTask task;
    public Activity mContext = null;
    public GUIManager mGUIManager = null;
    public PopupWindow mWindow = null;
    public View mViewRoot = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 26;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    /* loaded from: classes3.dex */
    public class DownloadImageTask extends Thread {
        public FrameLayout bmImage;
        public Bitmap mIcon11;
        public String urls;

        public DownloadImageTask(FrameLayout bmImage, String url) {
            this.bmImage = bmImage;
            this.urls = url;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str = this.urls;
            this.mIcon11 = null;
            try {
                this.mIcon11 = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(str)));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (BrNewCaptcha.mIsShowing) {
                BrNewCaptcha.this.mContext.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrNewCaptcha.DownloadImageTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DownloadImageTask.this.bmImage.setBackground(new BitmapDrawable(BrNewCaptcha.this.mContext.getResources(), DownloadImageTask.this.mIcon11));
                        DownloadImageTask.this.bmImage.getChildAt(0).setVisibility(4);
                    }
                });
            }
        }
    }

    public static ISAMPGUI newInstance() {
        return new BrNewCaptcha();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) throws Resources.NotFoundException {
        if (mIsShowing) {
            return;
        }
        mIsShowing = true;
        if (activity != null) {
            this.mContext = activity;
        }
        this.mGUIManager = manager;
        try {
            this.CaptchaURL = json.getString("u");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.mWindow == null) {
            this.mViewRoot = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.br_new_captcha, (ViewGroup) null, false);
            PopupWindow popupWindow = new PopupWindow(this.mViewRoot, -2, -2, true);
            this.mWindow = popupWindow;
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            UsefulKt.setCustomTouchInterceptor(this.mWindow);
            this.mWindow.setSoftInputMode(16);
            DownloadImageTask downloadImageTask = new DownloadImageTask((FrameLayout) this.mViewRoot.findViewById(R.id.br_new_captha_img), this.CaptchaURL);
            this.task = downloadImageTask;
            downloadImageTask.start();
            final EditText editText = (EditText) this.mViewRoot.findViewById(R.id.br_new_caphca_line);
            final Button button = (Button) this.mViewRoot.findViewById(R.id.br_new_capcha_ok);
            button.setAlpha(0.6f);
            editText.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.legacy.BrNewCaptcha.1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable.toString().isEmpty()) {
                        button.setAlpha(0.6f);
                    } else {
                        button.setAlpha(1.0f);
                    }
                }
            });
            final Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.button_click);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrNewCaptcha.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (view.getAlpha() < 1.0f) {
                        return;
                    }
                    view.startAnimation(animationLoadAnimation);
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrNewCaptcha.2.1
                        @Override // java.lang.Runnable
                        public void run() throws JSONException {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("t", 0);
                                jSONObject.put("s", editText.getText().toString());
                                BrNewCaptcha.this.mGUIManager.sendJsonData(26, jSONObject);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }, 400L);
                }
            });
            this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrNewCaptcha.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() throws JSONException {
                    BrNewCaptcha brNewCaptcha = BrNewCaptcha.this;
                    DownloadImageTask downloadImageTask2 = brNewCaptcha.task;
                    if (downloadImageTask2 != null) {
                        brNewCaptcha.task = null;
                        downloadImageTask2.interrupt();
                    }
                    if (!BrNewCaptcha.this.dontSend) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("t", 0);
                            jSONObject.put("s", editText.getText().toString());
                            BrNewCaptcha.this.mGUIManager.sendJsonData(26, jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    BrNewCaptcha.mIsShowing = false;
                }
            });
            this.mWindow.showAtLocation(activity.getParentLayout(), 17, 0, 0);
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow != null) {
            this.dontSend = true;
            popupWindow.dismiss();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return mIsShowing;
    }
}
