package com.blackhub.bronline.game.gui.registration;

import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationInvite extends UILayout {
    public Button butEnter;
    public Button butSkip;
    public CustomEditTextWithBackPressEvent editInvite;
    public GUIRegistration mRoot;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public TextView textInvite;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationInvite(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.reg_invite, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.editInvite = (CustomEditTextWithBackPressEvent) viewInflate.findViewById(R.id.invite_nick);
        this.textInvite = (TextView) this.mViewRoot.findViewById(R.id.text_invite);
        this.butEnter = (Button) this.mViewRoot.findViewById(R.id.but_continue);
        this.butSkip = (Button) this.mViewRoot.findViewById(R.id.but_skip);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        this.textInvite.setText(Html.fromHtml("Введя никнейм пригласившего вас игрока, <font color=#FFC634>он и вы</font> получите ценные призы по достижению <font color=#FFC634>3 уровня</font>!"));
        this.butEnter.setAlpha(0.5f);
        this.editInvite.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite.1
            public ViewTreeObserverOnGlobalLayoutListenerC44551() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationInvite.this.editInvite.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.editInvite.getLayoutParams();
                int width = (int) (UILayoutRegistrationInvite.this.editInvite.getWidth() * 0.16f);
                layoutParams.height = width;
                UILayoutRegistrationInvite.this.editInvite.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.butEnter.getLayoutParams();
                layoutParams2.height = width;
                UILayoutRegistrationInvite.this.butEnter.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.butSkip.getLayoutParams();
                layoutParams3.height = width;
                UILayoutRegistrationInvite.this.butSkip.setLayoutParams(layoutParams3);
            }
        });
        this.editInvite.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite.2
            public ViewOnKeyListenerC44562() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationInvite.this.editInvite.getText().length() == 0) {
                    UILayoutRegistrationInvite.this.butEnter.setAlpha(0.5f);
                } else {
                    UILayoutRegistrationInvite.this.butEnter.setAlpha(1.0f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationInvite.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationInvite.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationInvite.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.editInvite.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite.3
            public C44573() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationInvite.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationInvite.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationInvite.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationInvite.this.editInvite.setFocusable(false);
                UILayoutRegistrationInvite.this.editInvite.setFocusableInTouchMode(true);
            }
        });
        this.butEnter.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite.4
            public ViewOnClickListenerC44584() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationInvite.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 4);
                    jSONObject.put("s", UILayoutRegistrationInvite.this.editInvite.getText().toString());
                    UILayoutRegistrationInvite.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.butSkip.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite.5
            public ViewOnClickListenerC44595() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationInvite.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 4);
                    jSONObject.put("s", "");
                    UILayoutRegistrationInvite.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return this.mViewRoot;
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite$1 */
    public class ViewTreeObserverOnGlobalLayoutListenerC44551 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC44551() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UILayoutRegistrationInvite.this.editInvite.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.editInvite.getLayoutParams();
            int width = (int) (UILayoutRegistrationInvite.this.editInvite.getWidth() * 0.16f);
            layoutParams.height = width;
            UILayoutRegistrationInvite.this.editInvite.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.butEnter.getLayoutParams();
            layoutParams2.height = width;
            UILayoutRegistrationInvite.this.butEnter.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationInvite.this.butSkip.getLayoutParams();
            layoutParams3.height = width;
            UILayoutRegistrationInvite.this.butSkip.setLayoutParams(layoutParams3);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite$2 */
    public class ViewOnKeyListenerC44562 implements View.OnKeyListener {
        public ViewOnKeyListenerC44562() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationInvite.this.editInvite.getText().length() == 0) {
                UILayoutRegistrationInvite.this.butEnter.setAlpha(0.5f);
            } else {
                UILayoutRegistrationInvite.this.butEnter.setAlpha(1.0f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationInvite.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationInvite.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationInvite.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite$3 */
    public class C44573 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public C44573() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationInvite.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationInvite.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationInvite.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationInvite.this.editInvite.setFocusable(false);
            UILayoutRegistrationInvite.this.editInvite.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite$4 */
    public class ViewOnClickListenerC44584 implements View.OnClickListener {
        public ViewOnClickListenerC44584() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationInvite.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 4);
                jSONObject.put("s", UILayoutRegistrationInvite.this.editInvite.getText().toString());
                UILayoutRegistrationInvite.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationInvite$5 */
    public class ViewOnClickListenerC44595 implements View.OnClickListener {
        public ViewOnClickListenerC44595() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            view.startAnimation(UILayoutRegistrationInvite.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 4);
                jSONObject.put("s", "");
                UILayoutRegistrationInvite.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        this.mUIParent.textHint.setText(Html.fromHtml("Никнейм друга должен быть в формате: <b>Nick_Name</b>"));
        this.mUIParent.textHeader.setText("Тебя пригласил друг?");
    }
}
