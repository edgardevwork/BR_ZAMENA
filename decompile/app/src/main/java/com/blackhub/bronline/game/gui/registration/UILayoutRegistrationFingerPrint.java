package com.blackhub.bronline.game.gui.registration;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.blackhub.bronline.game.common.GUIPopupWindow;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;
import com.bless.client.R;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationFingerPrint extends UILayout implements FingerprintApi.Callback {
    public LinearLayout butBack;
    public Button butSkip;
    public ImageView imgAutoHint;
    public ImageView imgFinger;
    public LinearLayout llText;
    public GUIRegistration mRoot;
    public GUIPopupWindow mScannerWindow;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public Switch switchAuto;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationFingerPrint(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.reg_fingerprint, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.imgFinger = (ImageView) viewInflate.findViewById(R.id.finger_img);
        this.butBack = (LinearLayout) this.mViewRoot.findViewById(R.id.back);
        this.switchAuto = (Switch) this.mViewRoot.findViewById(R.id.auto_switch);
        this.llText = (LinearLayout) this.mViewRoot.findViewById(R.id.auto_text);
        this.butSkip = (Button) this.mViewRoot.findViewById(R.id.butt_skip);
        this.imgAutoHint = (ImageView) this.mViewRoot.findViewById(R.id.auto_img);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        if (this.mRoot.mIsRegistration) {
            this.switchAuto.setVisibility(8);
            this.llText.setVisibility(8);
            this.butSkip.setVisibility(0);
        } else {
            this.switchAuto.setVisibility(0);
            this.llText.setVisibility(0);
            this.butSkip.setVisibility(8);
        }
        this.imgFinger.setOnClickListener(new ViewOnClickListenerC44451(this));
        this.butSkip.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.2
            public ViewOnClickListenerC44462() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 2);
                    jSONObject.put("s", "");
                    jSONObject.put("r", 0);
                    UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                UIContainer uIContainer = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationFingerPrint.this.mUIParent;
                uIContainer.setCurrentLayout(3);
            }
        });
        this.switchAuto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.3
            public C44473() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    UILayoutRegistrationFingerPrint.this.switchAuto.setThumbResource(R.drawable.bg_oval_red_s20);
                } else {
                    UILayoutRegistrationFingerPrint.this.switchAuto.setThumbResource(R.drawable.bg_oval_gray_s20);
                }
            }
        });
        this.imgAutoHint.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.4
            public ViewOnTouchListenerC44484() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
                UILayoutRegistrationFingerPrint.this.mRoot.showPopup("Автовход", "При активации переключателя автовхода, система запомнит ваши данные и авторизует вас автоматически, при следующей авторизации без ввода данных. Активация автовхода работает в течении 15 минут после последнего отключения от сервера. По истечению времени после отключения игрока с сервера, автовход автоматически отключается.", "Ок", null, null);
                return false;
            }
        });
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.5
            public ViewOnTouchListenerC44495() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
                if (UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                    UIContainer uIContainer = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
                    UILayoutRegistrationGeneral unused = UILayoutRegistrationFingerPrint.this.mUIParent;
                    uIContainer.setCurrentLayout(1);
                    return false;
                }
                UIContainer uIContainer2 = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused2 = UILayoutRegistrationFingerPrint.this.mUIParent;
                uIContainer2.setCurrentLayout(4);
                return false;
            }
        });
        return this.mViewRoot;
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$1 */
    public class ViewOnClickListenerC44451 implements View.OnClickListener {
        public final /* synthetic */ UILayoutRegistrationFingerPrint val$parentUI;

        public ViewOnClickListenerC44451(final UILayoutRegistrationFingerPrint val$parentUI) {
            this.val$parentUI = val$parentUI;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
            UILayoutRegistrationFingerPrint.this.mRoot.mActivity.Fapi.start(this.val$parentUI);
            new Handler().postDelayed(new AnonymousClass1(), 300L);
        }

        /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$1$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                    UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                }
                View viewInflate = ((LayoutInflater) UILayoutRegistrationFingerPrint.this.mRoot.mActivity.getSystemService("layout_inflater")).inflate(R.layout.mini_game_events_popup_dialog, (ViewGroup) null, false);
                UILayoutRegistrationFingerPrint.this.mScannerWindow = new GUIPopupWindow(viewInflate, -2, -2, false);
                viewInflate.findViewById(R.id.mini_games_close).setVisibility(8);
                viewInflate.findViewById(R.id.mini_games_apply_two).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.1.1.1
                    public ViewOnClickListenerC118901() {
                    }

                    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$1$1$1$1 */
                    public class RunnableC118911 implements Runnable {
                        public RunnableC118911() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                        }
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        UILayoutRegistrationFingerPrint.this.mRoot.mActivity.Fapi.cancel();
                        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.1.1.1.1
                            public RunnableC118911() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                            }
                        }, 500L);
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.mini_games_header)).setText("Сканер");
                ((TextView) viewInflate.findViewById(R.id.mini_games_content)).setText("Приложите палец к сканеру отпечатков");
                ((Button) viewInflate.findViewById(R.id.mini_games_apply_two)).setText("Назад");
                UILayoutRegistrationFingerPrint.this.mScannerWindow.showAtLocation(UILayoutRegistrationFingerPrint.this.mRoot.mActivity.getParentLayout(), 17, 0, 0);
                UILayoutRegistrationFingerPrint.this.mScannerWindow.setDimming(1.0f);
            }

            /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$1$1$1 */
            public class ViewOnClickListenerC118901 implements View.OnClickListener {
                public ViewOnClickListenerC118901() {
                }

                /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$1$1$1$1 */
                public class RunnableC118911 implements Runnable {
                    public RunnableC118911() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                    }
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UILayoutRegistrationFingerPrint.this.mRoot.mActivity.Fapi.cancel();
                    new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.1.1.1.1
                        public RunnableC118911() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                        }
                    }, 500L);
                }
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$2 */
    public class ViewOnClickListenerC44462 implements View.OnClickListener {
        public ViewOnClickListenerC44462() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 2);
                jSONObject.put("s", "");
                jSONObject.put("r", 0);
                UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            UIContainer uIContainer = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused = UILayoutRegistrationFingerPrint.this.mUIParent;
            uIContainer.setCurrentLayout(3);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$3 */
    public class C44473 implements CompoundButton.OnCheckedChangeListener {
        public C44473() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                UILayoutRegistrationFingerPrint.this.switchAuto.setThumbResource(R.drawable.bg_oval_red_s20);
            } else {
                UILayoutRegistrationFingerPrint.this.switchAuto.setThumbResource(R.drawable.bg_oval_gray_s20);
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$4 */
    public class ViewOnTouchListenerC44484 implements View.OnTouchListener {
        public ViewOnTouchListenerC44484() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
            UILayoutRegistrationFingerPrint.this.mRoot.showPopup("Автовход", "При активации переключателя автовхода, система запомнит ваши данные и авторизует вас автоматически, при следующей авторизации без ввода данных. Активация автовхода работает в течении 15 минут после последнего отключения от сервера. По истечению времени после отключения игрока с сервера, автовход автоматически отключается.", "Ок", null, null);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$5 */
    public class ViewOnTouchListenerC44495 implements View.OnTouchListener {
        public ViewOnTouchListenerC44495() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationFingerPrint.this.mRoot.mAnim);
            if (UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                UIContainer uIContainer = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationFingerPrint.this.mUIParent;
                uIContainer.setCurrentLayout(1);
                return false;
            }
            UIContainer uIContainer2 = UILayoutRegistrationFingerPrint.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused2 = UILayoutRegistrationFingerPrint.this.mUIParent;
            uIContainer2.setCurrentLayout(4);
            return false;
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        if (!this.mRoot.mIsRegistration) {
            this.mUIParent.textHint.setText("Кликните по отпечатку пальца для того чтобы идентифицировать вас!");
        } else {
            this.mUIParent.textHint.setText("Активировав отпечаток пальца, вы сможете входить без ввода пароля.\n\nКликните по отпечатку пальца для того чтобы идентифицировать вас.");
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$6 */
    public class RunnableC44506 implements Runnable {
        public RunnableC44506() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
            }
        }
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onSuccess(String publicKey) throws JSONException {
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.6
            public RunnableC44506() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                    UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                }
            }
        }, 500L);
        if (publicKey != null) {
            OnScanResult(publicKey.replaceAll(StringUtils.f9903LF, "F").replace("\\", "F").replace("/", "F"));
        } else {
            onError(228);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$7 */
    public class RunnableC44517 implements Runnable {
        public RunnableC44517() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
            }
            if (!UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                UILayoutRegistrationFingerPrint.this.OnScanResult("error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("d", 3);
                jSONObject.put("t", 2);
                jSONObject.put("s", -99);
                jSONObject.put("i", "Нераспознанный отпечаток. Попробуйте снова.");
                UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.showGUI(13, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onFailure() {
        this.mRoot.mActivity.Fapi.cancel();
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.7
            public RunnableC44517() {
            }

            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                    UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                }
                if (!UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                    UILayoutRegistrationFingerPrint.this.OnScanResult("error");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    jSONObject.put("i", "Нераспознанный отпечаток. Попробуйте снова.");
                    UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                } catch (Exception unused) {
                }
            }
        }, 500L);
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint$8 */
    public class RunnableC44528 implements Runnable {
        public RunnableC44528() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
            }
            if (!UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                UILayoutRegistrationFingerPrint.this.OnScanResult("error");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("d", 3);
                jSONObject.put("t", 2);
                jSONObject.put("s", -99);
                jSONObject.put("i", "Ошибка. Попробуйте снова.");
                UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.showGUI(13, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onError(int errorCode) {
        this.mRoot.mActivity.Fapi.cancel();
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationFingerPrint.8
            public RunnableC44528() {
            }

            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (UILayoutRegistrationFingerPrint.this.mScannerWindow != null) {
                    UILayoutRegistrationFingerPrint.this.mScannerWindow.dismiss();
                }
                if (!UILayoutRegistrationFingerPrint.this.mRoot.mIsRegistration) {
                    UILayoutRegistrationFingerPrint.this.OnScanResult("error");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    jSONObject.put("i", "Ошибка. Попробуйте снова.");
                    UILayoutRegistrationFingerPrint.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                } catch (Exception unused) {
                }
            }
        }, 500L);
    }

    public void OnScanResult(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 2);
            jSONObject.put("s", str);
            jSONObject.put("r", !this.mRoot.mIsRegistration ? 1 : 0);
            jSONObject.put("tt", this.switchAuto.isChecked() ? 1 : 0);
            this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
