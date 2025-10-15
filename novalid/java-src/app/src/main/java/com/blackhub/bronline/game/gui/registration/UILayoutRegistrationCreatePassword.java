package com.blackhub.bronline.game.gui.registration;

import android.text.Html;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationCreatePassword extends UILayout {
    public LinearLayout butBack;
    public Button butt;
    public CustomEditTextWithBackPressEvent edit1;
    public CustomEditTextWithBackPressEvent edit2;
    public CustomEditTextWithBackPressEvent edit3;
    public GUIRegistration mRoot;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public TextView textHeader;
    public TextView textRestore;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationCreatePassword(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        this.mViewRoot = inflater.inflate(R.layout.registration_create_password, (ViewGroup) null, false);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        this.butBack = (LinearLayout) this.mViewRoot.findViewById(R.id.back_butt);
        this.textHeader = (TextView) this.mViewRoot.findViewById(R.id.header_text);
        this.textRestore = (TextView) this.mViewRoot.findViewById(R.id.restore_text);
        this.butt = (Button) this.mViewRoot.findViewById(R.id.reg_butt);
        this.edit1 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit1);
        this.edit2 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit2);
        this.edit3 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit3);
        return this.mViewRoot;
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$1 */
    public class ViewTreeObserverOnGlobalLayoutListenerC44121 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC44121() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UILayoutRegistrationCreatePassword.this.butt.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.butt.getLayoutParams();
            int width = (int) (UILayoutRegistrationCreatePassword.this.butt.getWidth() * 0.16f);
            layoutParams.height = width;
            UILayoutRegistrationCreatePassword.this.butt.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit1.getLayoutParams();
            layoutParams2.height = width;
            UILayoutRegistrationCreatePassword.this.edit1.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit2.getLayoutParams();
            layoutParams3.height = width;
            UILayoutRegistrationCreatePassword.this.edit2.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit3.getLayoutParams();
            layoutParams4.height = width;
            UILayoutRegistrationCreatePassword.this.edit3.setLayoutParams(layoutParams4);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        this.butt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.1
            public ViewTreeObserverOnGlobalLayoutListenerC44121() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationCreatePassword.this.butt.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.butt.getLayoutParams();
                int width = (int) (UILayoutRegistrationCreatePassword.this.butt.getWidth() * 0.16f);
                layoutParams.height = width;
                UILayoutRegistrationCreatePassword.this.butt.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit1.getLayoutParams();
                layoutParams2.height = width;
                UILayoutRegistrationCreatePassword.this.edit1.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit2.getLayoutParams();
                layoutParams3.height = width;
                UILayoutRegistrationCreatePassword.this.edit2.setLayoutParams(layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit3.getLayoutParams();
                layoutParams4.height = width;
                UILayoutRegistrationCreatePassword.this.edit3.setLayoutParams(layoutParams4);
            }
        });
        GUIRegistration gUIRegistration = this.mRoot;
        if (gUIRegistration.mIsRegistration) {
            RegistrationSet();
            return;
        }
        int i = gUIRegistration.mRestoreSet;
        if (i == 0) {
            RestoreSet();
            return;
        }
        if (i == 1) {
            RestoreNewSet();
        } else if (i == 2) {
            PinSet();
        } else {
            if (i != 3) {
                return;
            }
            PinRestoreSet();
        }
    }

    public final void RegistrationSet() {
        this.butt.setText("Зарегистрироваться");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Электронная почта (необязательно)");
        this.edit2.setVisibility(0);
        this.edit2.setHint("Пароль");
        this.edit3.setVisibility(0);
        this.edit3.setHint("Повторите пароль");
        this.textHeader.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(1);
        this.edit2.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit2.setRawInputType(128);
        this.edit2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit3.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit3.setRawInputType(128);
        this.edit3.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.butt.setAlpha(0.5f);
        this.edit1.setText("");
        this.edit2.setText("");
        this.edit3.setText("");
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.2
            public C44232() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.edit2.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.3
            public ViewOnKeyListenerC44343() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                    return false;
                }
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                return false;
            }
        });
        this.edit2.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.4
            public C44374() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            }
        });
        this.edit3.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.5
            public ViewOnKeyListenerC44385() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit3.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.6
            public C44396() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(4);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.7
            public ViewOnTouchListenerC44407() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                boolean z = UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration;
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.8
            public ViewOnClickListenerC44418() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                            jSONObject.put("i", "Пароли не совпадают");
                        } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                            jSONObject.put("i", "Придумайте пароль");
                        } else {
                            jSONObject.put("i", "Пароль слишком короткий");
                        }
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                if (UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("t", 1);
                        jSONObject2.put("s", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                        jSONObject2.put("p", UILayoutRegistrationCreatePassword.this.edit2.getText().toString());
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                    } catch (Exception unused2) {
                    }
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("<b>Для начала игры, заполни все поля</b>\n<ul><li>Пароль должен состоять от 6 до 16 символов</li><li>Пароль чувствителен к регистру</li></ul>"));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$2 */
    public class C44232 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C44232() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$3 */
    public class ViewOnKeyListenerC44343 implements View.OnKeyListener {
        public ViewOnKeyListenerC44343() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                return false;
            }
            UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$4 */
    public class C44374 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C44374() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$5 */
    public class ViewOnKeyListenerC44385 implements View.OnKeyListener {
        public ViewOnKeyListenerC44385() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$6 */
    public class C44396 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C44396() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$7 */
    public class ViewOnTouchListenerC44407 implements View.OnTouchListener {
        public ViewOnTouchListenerC44407() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            boolean z = UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration;
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$8 */
    public class ViewOnClickListenerC44418 implements View.OnClickListener {
        public ViewOnClickListenerC44418() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                        jSONObject.put("i", "Пароли не совпадают");
                    } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                        jSONObject.put("i", "Придумайте пароль");
                    } else {
                        jSONObject.put("i", "Пароль слишком короткий");
                    }
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            if (UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("t", 1);
                    jSONObject2.put("s", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject2.put("p", UILayoutRegistrationCreatePassword.this.edit2.getText().toString());
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void RestoreSet() {
        String str;
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Код восстановления:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.9
            public ViewOnKeyListenerC44429() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.10
            public C441310() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.11
            public ViewOnTouchListenerC441411() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
                uIContainer.setCurrentLayout(4);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.12
            public ViewOnClickListenerC441512() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 0);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        int i = this.mRoot.mRestoreMethod;
        if (i == 1) {
            str = "вам в Telegram";
        } else if (i != 2) {
            str = "на ваш e-mail";
        } else {
            str = "вам в VK";
        }
        this.mUIParent.textHint.setText(Html.fromHtml("Забыли свой пароль? Мы выслали код восстановления" + str + ". Проверьте указанное место и введите код в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$9 */
    public class ViewOnKeyListenerC44429 implements View.OnKeyListener {
        public ViewOnKeyListenerC44429() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$10 */
    public class C441310 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C441310() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$11 */
    public class ViewOnTouchListenerC441411 implements View.OnTouchListener {
        public ViewOnTouchListenerC441411() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
            uIContainer.setCurrentLayout(4);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$12 */
    public class ViewOnClickListenerC441512 implements View.OnClickListener {
        public ViewOnClickListenerC441512() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 0);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void RestoreNewSet() {
        this.textHeader.setVisibility(8);
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Новый пароль");
        this.edit2.setVisibility(0);
        this.edit2.setHint("Повторите новый пароль");
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        this.edit2.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit2.setRawInputType(128);
        this.edit2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.13
            public ViewOnKeyListenerC441613() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit1.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit2.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                    return false;
                }
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                return false;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.14
            public C441714() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.edit2.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.15
            public ViewOnKeyListenerC441815() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit2.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.16
            public C441916() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.17
            public ViewOnTouchListenerC442017() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
                uIContainer.setCurrentLayout(4);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.18
            public ViewOnClickListenerC442118() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                            jSONObject.put("i", "Пароли не совпадают");
                        } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                            jSONObject.put("i", "Придумайте пароль");
                        } else {
                            jSONObject.put("i", "Пароль слишком короткий");
                        }
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("t", 8);
                    jSONObject2.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject2.put("tt", 4);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                } catch (Exception unused2) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Отлично! Код подошел. Теперь придумайте новый пароль, а затем повторите его."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$13 */
    public class ViewOnKeyListenerC441613 implements View.OnKeyListener {
        public ViewOnKeyListenerC441613() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit1.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit2.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                return false;
            }
            UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$14 */
    public class C441714 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C441714() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$15 */
    public class ViewOnKeyListenerC441815 implements View.OnKeyListener {
        public ViewOnKeyListenerC441815() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$16 */
    public class C441916 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C441916() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$17 */
    public class ViewOnTouchListenerC442017 implements View.OnTouchListener {
        public ViewOnTouchListenerC442017() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
            uIContainer.setCurrentLayout(4);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$18 */
    public class ViewOnClickListenerC442118 implements View.OnClickListener {
        public ViewOnClickListenerC442118() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                        jSONObject.put("i", "Пароли не совпадают");
                    } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                        jSONObject.put("i", "Придумайте пароль");
                    } else {
                        jSONObject.put("i", "Пароль слишком короткий");
                    }
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("t", 8);
                jSONObject2.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject2.put("tt", 4);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
            } catch (Exception unused2) {
            }
        }
    }

    public final void PinSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите пин-код:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите пин-код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.butBack.setVisibility(4);
        this.textRestore.setVisibility(0);
        this.textRestore.setText(Html.fromHtml("<u>Восстановить пин-код</u>"));
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(2);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.19
            public ViewOnKeyListenerC442219() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.20
            public C442420() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.textRestore.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.21
            public ViewOnClickListenerC442521() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 7);
                    jSONObject.put("r", 1);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.22
            public ViewOnClickListenerC442622() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 1);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Если вы забыли свой пин-код вы можете восстановить его. Нажмите на «Восстановить пин-код» и мы отправим его на ваш e-mail.."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$19 */
    public class ViewOnKeyListenerC442219 implements View.OnKeyListener {
        public ViewOnKeyListenerC442219() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$20 */
    public class C442420 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C442420() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$21 */
    public class ViewOnClickListenerC442521 implements View.OnClickListener {
        public ViewOnClickListenerC442521() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 7);
                jSONObject.put("r", 1);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$22 */
    public class ViewOnClickListenerC442622 implements View.OnClickListener {
        public ViewOnClickListenerC442622() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 1);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void PinRestoreSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите код аутентификатора:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        if (this.mRoot.f425mT != 2) {
            this.butBack.setVisibility(0);
        } else {
            this.butBack.setVisibility(4);
        }
        this.textRestore.setVisibility(0);
        this.textRestore.setText(Html.fromHtml("<u>Восстановить код</u>"));
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.23
            public ViewOnKeyListenerC442723() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.24
            public C442824() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.25
            public ViewOnTouchListenerC442925() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 2;
                UILayoutRegistrationCreatePassword.this.PinSet();
                return false;
            }
        });
        this.textRestore.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.26
            public ViewOnClickListenerC443026() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.mRoot.f425mT != 2) {
                    view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                }
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 4;
                UILayoutRegistrationCreatePassword.this.PinAuthSet();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 7);
                    jSONObject.put("r", 2);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.27
            public ViewOnClickListenerC443127() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 2);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Введите код Google Authenticator в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$23 */
    public class ViewOnKeyListenerC442723 implements View.OnKeyListener {
        public ViewOnKeyListenerC442723() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$24 */
    public class C442824 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C442824() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$25 */
    public class ViewOnTouchListenerC442925 implements View.OnTouchListener {
        public ViewOnTouchListenerC442925() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 2;
            UILayoutRegistrationCreatePassword.this.PinSet();
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$26 */
    public class ViewOnClickListenerC443026 implements View.OnClickListener {
        public ViewOnClickListenerC443026() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.mRoot.f425mT != 2) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            }
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 4;
            UILayoutRegistrationCreatePassword.this.PinAuthSet();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 7);
                jSONObject.put("r", 2);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$27 */
    public class ViewOnClickListenerC443127 implements View.OnClickListener {
        public ViewOnClickListenerC443127() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 2);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void PinAuthSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите код отключения:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.butBack.setVisibility(0);
        this.textRestore.setVisibility(8);
        this.edit1.setInputType(128);
        this.edit1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.28
            public ViewOnKeyListenerC443228() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.29
            public C443329() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.30
            public ViewOnTouchListenerC443530() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (UILayoutRegistrationCreatePassword.this.mRoot.f425mT != 2) {
                    view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                }
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 3;
                UILayoutRegistrationCreatePassword.this.PinRestoreSet();
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.31
            public ViewOnClickListenerC443631() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 3);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("На вашу почту был отправлен код отключения Google Authenticator. Введите его в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$28 */
    public class ViewOnKeyListenerC443228 implements View.OnKeyListener {
        public ViewOnKeyListenerC443228() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$29 */
    public class C443329 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C443329() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$30 */
    public class ViewOnTouchListenerC443530 implements View.OnTouchListener {
        public ViewOnTouchListenerC443530() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (UILayoutRegistrationCreatePassword.this.mRoot.f425mT != 2) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            }
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 3;
            UILayoutRegistrationCreatePassword.this.PinRestoreSet();
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$31 */
    public class ViewOnClickListenerC443631 implements View.OnClickListener {
        public ViewOnClickListenerC443631() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 3);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
