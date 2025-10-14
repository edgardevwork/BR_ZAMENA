package com.blackhub.bronline.game.gui.registration;

import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationLogin extends UILayout {
    public LinearLayout butBack;
    public LinearLayout butFinger;
    public Button butPlay;
    public CustomEditTextWithBackPressEvent editPassword;
    public ImageView imgAutoHint;
    public GUIRegistration mRoot;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public SwitchMaterial switchAuto;
    public TextView textPassword;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationLogin(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        this.mViewRoot = inflater.inflate(R.layout.reg_login, (ViewGroup) null, false);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        this.butBack = (LinearLayout) this.mViewRoot.findViewById(R.id.back_but);
        this.butFinger = (LinearLayout) this.mViewRoot.findViewById(R.id.fingerprint_but);
        this.editPassword = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.password_enter);
        this.textPassword = (TextView) this.mViewRoot.findViewById(R.id.password_text);
        this.butPlay = (Button) this.mViewRoot.findViewById(R.id.play_but);
        this.switchAuto = (SwitchMaterial) this.mViewRoot.findViewById(R.id.auto_switch);
        this.imgAutoHint = (ImageView) this.mViewRoot.findViewById(R.id.auto_img);
        GUIRegistration gUIRegistration = this.mRoot;
        if (!gUIRegistration.mHasFingerprint || !gUIRegistration.mActivity.isSupportFingerPrint) {
            this.butFinger.setAlpha(0.5f);
        }
        this.butFinger.setVisibility(8);
        this.editPassword.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onCreateView$0();
            }
        });
        if (this.mRoot.mHasMail) {
            this.textPassword.setText(Html.fromHtml("<u>Восстановить пароль</u>"));
            this.textPassword.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.1
                public ViewOnClickListenerC44601() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("t", 7);
                        jSONObject.put("r", 0);
                        UILayoutRegistrationLogin.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            this.textPassword.setVisibility(4);
        }
        this.editPassword.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.2
            public ViewOnKeyListenerC44612() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationLogin.this.editPassword.getText().length() >= 6) {
                    UILayoutRegistrationLogin.this.butPlay.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationLogin.this.butPlay.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.editPassword.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.3
            public C44623() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationLogin.this.editPassword.setFocusable(false);
                UILayoutRegistrationLogin.this.editPassword.setFocusableInTouchMode(true);
            }
        });
        this.butPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.4
            public ViewOnClickListenerC44634() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationLogin.this.editPassword.getText().toString().length() >= 6) {
                    UILayoutRegistrationLogin.this.butPlay.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationLogin.this.butPlay.setAlpha(0.5f);
                }
                if (UILayoutRegistrationLogin.this.butPlay.getAlpha() < 1.0f) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        if (UILayoutRegistrationLogin.this.editPassword.getText().length() == 0) {
                            jSONObject.put("i", "Введите пароль");
                        } else {
                            jSONObject.put("i", "Пароль слишком короткий");
                        }
                        UILayoutRegistrationLogin.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("t", 6);
                    jSONObject2.put("s", UILayoutRegistrationLogin.this.editPassword.getText().toString());
                    jSONObject2.put("r", UILayoutRegistrationLogin.this.switchAuto.isChecked() ? 1 : 0);
                    UILayoutRegistrationLogin.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                } catch (Exception unused2) {
                }
            }
        });
        this.butFinger.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.5
            public ViewOnClickListenerC44645() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (view.getAlpha() < 1.0f) {
                    if (UILayoutRegistrationLogin.this.mRoot.mNeedPasswordNow) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("d", 3);
                            jSONObject.put("t", 2);
                            jSONObject.put("s", -99);
                            jSONObject.put("i", "Авторизуйтесь при помощи пароля, а не отпечатка");
                            UILayoutRegistrationLogin.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
                UIContainer uIContainer = UILayoutRegistrationLogin.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused2 = UILayoutRegistrationLogin.this.mUIParent;
                uIContainer.setCurrentLayout(2);
            }
        });
        this.switchAuto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.6
            public C44656() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    UILayoutRegistrationLogin.this.switchAuto.setThumbResource(R.drawable.bg_oval_red_s20);
                } else {
                    UILayoutRegistrationLogin.this.switchAuto.setThumbResource(R.drawable.bg_oval_gray_s20);
                }
            }
        });
        this.imgAutoHint.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.7
            public ViewOnTouchListenerC44667() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
                UILayoutRegistrationLogin.this.mRoot.showPopup("Автовход", "При активации переключателя автовхода, система запомнит ваши данные и авторизует вас автоматически, при следующей авторизации без ввода данных. Активация автовхода работает в течении 15 минут после последнего отключения от сервера. По истечению времени после отключения игрока с сервера, автовход автоматически отключается.", "Ок", null, null);
                return false;
            }
        });
        this.butBack.setVisibility(4);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin.8
            public ViewOnTouchListenerC44678() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
                JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationLogin.this.editPassword.setFocusable(false);
                UILayoutRegistrationLogin.this.editPassword.setFocusableInTouchMode(true);
                return false;
            }
        });
        return this.mViewRoot;
    }

    public final /* synthetic */ void lambda$onCreateView$0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.editPassword.getLayoutParams();
        int width = (int) (this.editPassword.getWidth() * 0.16f);
        layoutParams.height = width;
        this.editPassword.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.butFinger.getLayoutParams();
        layoutParams2.height = width;
        this.butFinger.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.butPlay.getLayoutParams();
        layoutParams3.height = width;
        this.butPlay.setLayoutParams(layoutParams3);
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$1 */
    public class ViewOnClickListenerC44601 implements View.OnClickListener {
        public ViewOnClickListenerC44601() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 7);
                jSONObject.put("r", 0);
                UILayoutRegistrationLogin.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$2 */
    public class ViewOnKeyListenerC44612 implements View.OnKeyListener {
        public ViewOnKeyListenerC44612() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationLogin.this.editPassword.getText().length() >= 6) {
                UILayoutRegistrationLogin.this.butPlay.setAlpha(1.0f);
            } else {
                UILayoutRegistrationLogin.this.butPlay.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$3 */
    public class C44623 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C44623() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationLogin.this.editPassword.setFocusable(false);
            UILayoutRegistrationLogin.this.editPassword.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$4 */
    public class ViewOnClickListenerC44634 implements View.OnClickListener {
        public ViewOnClickListenerC44634() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationLogin.this.editPassword.getText().toString().length() >= 6) {
                UILayoutRegistrationLogin.this.butPlay.setAlpha(1.0f);
            } else {
                UILayoutRegistrationLogin.this.butPlay.setAlpha(0.5f);
            }
            if (UILayoutRegistrationLogin.this.butPlay.getAlpha() < 1.0f) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    if (UILayoutRegistrationLogin.this.editPassword.getText().length() == 0) {
                        jSONObject.put("i", "Введите пароль");
                    } else {
                        jSONObject.put("i", "Пароль слишком короткий");
                    }
                    UILayoutRegistrationLogin.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("t", 6);
                jSONObject2.put("s", UILayoutRegistrationLogin.this.editPassword.getText().toString());
                jSONObject2.put("r", UILayoutRegistrationLogin.this.switchAuto.isChecked() ? 1 : 0);
                UILayoutRegistrationLogin.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$5 */
    public class ViewOnClickListenerC44645 implements View.OnClickListener {
        public ViewOnClickListenerC44645() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (view.getAlpha() < 1.0f) {
                if (UILayoutRegistrationLogin.this.mRoot.mNeedPasswordNow) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        jSONObject.put("i", "Авторизуйтесь при помощи пароля, а не отпечатка");
                        UILayoutRegistrationLogin.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
            UIContainer uIContainer = UILayoutRegistrationLogin.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused2 = UILayoutRegistrationLogin.this.mUIParent;
            uIContainer.setCurrentLayout(2);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$6 */
    public class C44656 implements CompoundButton.OnCheckedChangeListener {
        public C44656() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                UILayoutRegistrationLogin.this.switchAuto.setThumbResource(R.drawable.bg_oval_red_s20);
            } else {
                UILayoutRegistrationLogin.this.switchAuto.setThumbResource(R.drawable.bg_oval_gray_s20);
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$7 */

    public class ViewOnTouchListenerC44667 implements View.OnTouchListener {
        public ViewOnTouchListenerC44667() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
            UILayoutRegistrationLogin.this.mRoot.showPopup("Автовход", "При активации переключателя автовхода, система запомнит ваши данные и авторизует вас автоматически, при следующей авторизации без ввода данных. Активация автовхода работает в течении 15 минут после последнего отключения от сервера. По истечению времени после отключения игрока с сервера, автовход автоматически отключается.", "Ок", null, null);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationLogin$8 */

    public class ViewOnTouchListenerC44678 implements View.OnTouchListener {
        public ViewOnTouchListenerC44678() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationLogin.this.mRoot.mAnim);
            JNIActivity jNIActivity = UILayoutRegistrationLogin.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationLogin.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationLogin.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationLogin.this.editPassword.setFocusable(false);
            UILayoutRegistrationLogin.this.editPassword.setFocusableInTouchMode(true);
            return false;
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        this.mUIParent.textHint.setText("Введите пароль, чтобы войти в игру.\n\nИнформация: если данный аккаунт является не вашим, то выйдите из игры и смените игровое имя на новое!");
    }
}
