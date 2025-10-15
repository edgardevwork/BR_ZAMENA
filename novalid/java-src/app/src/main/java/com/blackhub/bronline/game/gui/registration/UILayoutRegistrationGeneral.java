package com.blackhub.bronline.game.gui.registration;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.launcher.network.Server;
import com.bless.client.R;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class UILayoutRegistrationGeneral extends UILayout {
    public static final int REGISTRATION_SUBLAYOUT_CREATE_PASSWORD = 1;
    public static final int REGISTRATION_SUBLAYOUT_ENTER = 0;
    public static final int REGISTRATION_SUBLAYOUT_FINGERPRINT = 2;
    public static final int REGISTRATION_SUBLAYOUT_INVITE = 3;
    public static final int REGISTRATION_SUBLAYOUT_LOGIN = 4;
    public ImageView imgLogo;
    public GUIRegistration mRoot;
    public TextView textHeader;
    public TextView textHint;
    public TextView textNick;
    public View mViewRoot = null;
    public UIContainer mContainer = null;
    public int mHeightField = 0;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationGeneral(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View getView() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.registration_view, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.textHeader = (TextView) viewInflate.findViewById(R.id.reg_header);
        this.imgLogo = (ImageView) this.mViewRoot.findViewById(R.id.brlogo);
        this.textNick = (TextView) this.mViewRoot.findViewById(R.id.reg_nickname);
        this.textHint = (TextView) this.mViewRoot.findViewById(R.id.reg_info);
        UIContainer uIContainer = (UIContainer) this.mViewRoot.findViewById(R.id.reg_container);
        this.mContainer = uIContainer;
        uIContainer.addLayout(0, new UILayoutRegistrationEnter(this.mRoot));
        this.mContainer.addLayout(1, new UILayoutRegistrationCreatePassword(this.mRoot));
        this.mContainer.addLayout(2, new UILayoutRegistrationFingerPrint(this.mRoot));
        this.mContainer.addLayout(3, new UILayoutRegistrationInvite(this.mRoot));
        this.mContainer.addLayout(4, new UILayoutRegistrationLogin(this.mRoot));
        if (this.mRoot.mIsRegistration) {
            this.mContainer.setCurrentLayout(1);
        } else {
            this.mContainer.setCurrentLayout(4);
        }
        this.textNick.setText(this.mRoot.mActivity.getNick() + " [" + JNILib.getPlayerId() + "]");
        int currServer = JNIHelper.getCurrServer();
        List<Server> value = this.mRoot.jniActivityViewModel.getUpdatedServers().getValue();
        Objects.requireNonNull(value);
        if (currServer < value.size()) {
            List<Server> value2 = this.mRoot.jniActivityViewModel.getUpdatedServers().getValue();
            Objects.requireNonNull(value2);
            if (!value2.get(JNIHelper.getCurrServer()).getFirstName().toLowerCase().contains("test")) {
                StringBuilder sb = new StringBuilder();
                sb.append("logobr");
                List<Server> value3 = this.mRoot.jniActivityViewModel.getUpdatedServers().getValue();
                Objects.requireNonNull(value3);
                sb.append(value3.get(JNIHelper.getCurrServer()).getFirstName().toLowerCase());
                GameRender.getInstance().RequestTexture(sb.toString(), 25321, new GameRender.GameTextureListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationGeneral.1
                    @Override // com.blackhub.bronline.game.GameRender.GameTextureListener
                    public void OnTextureGet(int id, final Bitmap bitmap) {
                        UILayoutRegistrationGeneral.this.mRoot.mLogoBitmap = bitmap;
                        UILayoutRegistrationGeneral.this.mRoot.mActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationGeneral.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UILayoutRegistrationGeneral.this.imgLogo.setImageBitmap(bitmap);
                            }
                        });
                    }
                });
            }
        }
        if (this.mRoot.mIsRegistration) {
            this.textHeader.setText("Регистрация");
        } else {
            this.textHeader.setText("Авторизация");
        }
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        if (this.mRoot.mIsRegistration) {
            this.textHeader.setText("Регистрация");
        } else {
            this.textHeader.setText("Авторизация");
        }
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationGeneral.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationGeneral.this.mViewRoot.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ImageView imageView = (ImageView) UILayoutRegistrationGeneral.this.mViewRoot.findViewById(R.id.reg_person);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
                int height = (int) (UILayoutRegistrationGeneral.this.mViewRoot.getHeight() * 0.7f);
                ((ViewGroup.MarginLayoutParams) layoutParams).width = height;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = height;
                imageView.setLayoutParams(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) UILayoutRegistrationGeneral.this.imgLogo.getLayoutParams();
                int height2 = (int) (UILayoutRegistrationGeneral.this.mViewRoot.getHeight() * 0.15f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = height2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = height2 * 2;
                UILayoutRegistrationGeneral.this.imgLogo.setLayoutParams(layoutParams2);
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) UILayoutRegistrationGeneral.this.textHint.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) (height * (-0.6f));
                UILayoutRegistrationGeneral.this.textHint.setLayoutParams(layoutParams3);
            }
        });
    }
}
