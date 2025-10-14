package com.blackhub.bronline.game.gui.registration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.bless.client.R;

/* loaded from: classes.dex */
public class UILayoutRegistrationEnter extends UILayout {
    public Button butEnter;
    public Button butGoogleEnter;
    public Button butVkEnter;
    public GUIRegistration mRoot;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public TextView textHeader;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UILayoutRegistrationEnter(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.registration_enter, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.textHeader = (TextView) viewInflate.findViewById(R.id.text_header);
        this.butEnter = (Button) this.mViewRoot.findViewById(R.id.enter);
        this.butVkEnter = (Button) this.mViewRoot.findViewById(R.id.vk_enter);
        this.butGoogleEnter = (Button) this.mViewRoot.findViewById(R.id.google_enter);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        this.mViewRoot.findViewById(R.id.reg_ll).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationEnter.1
            public ViewTreeObserverOnGlobalLayoutListenerC44431() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationEnter.this.mViewRoot.findViewById(R.id.reg_ll).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butEnter.getLayoutParams();
                layoutParams.height = (int) (UILayoutRegistrationEnter.this.butEnter.getWidth() * 0.16f);
                UILayoutRegistrationEnter.this.butEnter.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butVkEnter.getLayoutParams();
                layoutParams2.height = (int) (UILayoutRegistrationEnter.this.butVkEnter.getWidth() * 0.16f);
                UILayoutRegistrationEnter.this.butVkEnter.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butGoogleEnter.getLayoutParams();
                layoutParams3.height = (int) (UILayoutRegistrationEnter.this.butGoogleEnter.getWidth() * 0.16f);
                UILayoutRegistrationEnter.this.butGoogleEnter.setLayoutParams(layoutParams3);
                UILayoutRegistrationEnter.this.mUIParent.mHeightField = layoutParams3.height;
                LinearLayout linearLayout = (LinearLayout) UILayoutRegistrationEnter.this.mViewRoot.findViewById(R.id.reg_ll);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), UILayoutRegistrationEnter.this.mViewRoot.getHeight() / 5, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
        });
        if (this.mRoot.mIsRegistration) {
            this.textHeader.setText("Выберите способ регистрации:");
            this.butEnter.setBackgroundResource(R.drawable.img_button_create_account);
            this.butVkEnter.setBackgroundResource(R.drawable.img_button_create_account_vk);
            this.butGoogleEnter.setBackgroundResource(R.drawable.img_button_create_account_google);
        } else {
            this.textHeader.setText("Выберите способ авторизации:");
            this.butEnter.setBackgroundResource(R.drawable.img_button_sign_in);
            this.butVkEnter.setBackgroundResource(R.drawable.img_button_sign_in_vk);
            this.butGoogleEnter.setBackgroundResource(R.drawable.img_button_sign_in_google);
        }
        this.butEnter.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationEnter.2
            public ViewOnClickListenerC44442() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(UILayoutRegistrationEnter.this.mRoot.mAnim);
                if (UILayoutRegistrationEnter.this.mRoot.mIsRegistration) {
                    UIContainer uIContainer = UILayoutRegistrationEnter.this.mUIParent.mContainer;
                    UILayoutRegistrationGeneral unused = UILayoutRegistrationEnter.this.mUIParent;
                    uIContainer.setCurrentLayout(1);
                } else {
                    UIContainer uIContainer2 = UILayoutRegistrationEnter.this.mUIParent.mContainer;
                    UILayoutRegistrationGeneral unused2 = UILayoutRegistrationEnter.this.mUIParent;
                    uIContainer2.setCurrentLayout(4);
                }
            }
        });
        return this.mViewRoot;
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationEnter$1 */
    public class ViewTreeObserverOnGlobalLayoutListenerC44431 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC44431() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UILayoutRegistrationEnter.this.mViewRoot.findViewById(R.id.reg_ll).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butEnter.getLayoutParams();
            layoutParams.height = (int) (UILayoutRegistrationEnter.this.butEnter.getWidth() * 0.16f);
            UILayoutRegistrationEnter.this.butEnter.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butVkEnter.getLayoutParams();
            layoutParams2.height = (int) (UILayoutRegistrationEnter.this.butVkEnter.getWidth() * 0.16f);
            UILayoutRegistrationEnter.this.butVkEnter.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationEnter.this.butGoogleEnter.getLayoutParams();
            layoutParams3.height = (int) (UILayoutRegistrationEnter.this.butGoogleEnter.getWidth() * 0.16f);
            UILayoutRegistrationEnter.this.butGoogleEnter.setLayoutParams(layoutParams3);
            UILayoutRegistrationEnter.this.mUIParent.mHeightField = layoutParams3.height;
            LinearLayout linearLayout = (LinearLayout) UILayoutRegistrationEnter.this.mViewRoot.findViewById(R.id.reg_ll);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), UILayoutRegistrationEnter.this.mViewRoot.getHeight() / 5, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationEnter$2 */
    public class ViewOnClickListenerC44442 implements View.OnClickListener {
        public ViewOnClickListenerC44442() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.startAnimation(UILayoutRegistrationEnter.this.mRoot.mAnim);
            if (UILayoutRegistrationEnter.this.mRoot.mIsRegistration) {
                UIContainer uIContainer = UILayoutRegistrationEnter.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationEnter.this.mUIParent;
                uIContainer.setCurrentLayout(1);
            } else {
                UIContainer uIContainer2 = UILayoutRegistrationEnter.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused2 = UILayoutRegistrationEnter.this.mUIParent;
                uIContainer2.setCurrentLayout(4);
            }
        }
    }
}
