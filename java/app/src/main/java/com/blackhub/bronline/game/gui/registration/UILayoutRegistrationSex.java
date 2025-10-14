package com.blackhub.bronline.game.gui.registration;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.game.common.UILayout;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationSex extends UILayout {
    public ImageView butFemale;
    public ImageView butMale;
    public Button butPlay;
    public ImageView imgLogo;
    public GUIRegistration mRoot;
    public View mViewRoot = null;
    public boolean isMaleActive = true;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UILayoutRegistrationSex(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.registration_sex, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.butMale = (ImageView) viewInflate.findViewById(R.id.male_butt);
        this.butFemale = (ImageView) this.mViewRoot.findViewById(R.id.female_butt);
        this.butPlay = (Button) this.mViewRoot.findViewById(R.id.butt);
        ImageView imageView = (ImageView) this.mViewRoot.findViewById(R.id.logo);
        this.imgLogo = imageView;
        Bitmap bitmap = this.mRoot.mLogoBitmap;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        this.butMale.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationSex.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(UILayoutRegistrationSex.this.mRoot.mAnim);
                UILayoutRegistrationSex uILayoutRegistrationSex = UILayoutRegistrationSex.this;
                if (uILayoutRegistrationSex.isMaleActive) {
                    return;
                }
                uILayoutRegistrationSex.butMale.setImageResource(R.drawable.img_male_active);
                UILayoutRegistrationSex.this.butFemale.setImageResource(R.drawable.img_female_inactive);
                UILayoutRegistrationSex.this.isMaleActive = true;
            }
        });
        this.butFemale.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationSex.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(UILayoutRegistrationSex.this.mRoot.mAnim);
                UILayoutRegistrationSex uILayoutRegistrationSex = UILayoutRegistrationSex.this;
                if (uILayoutRegistrationSex.isMaleActive) {
                    uILayoutRegistrationSex.butMale.setImageResource(R.drawable.img_male_inactive);
                    UILayoutRegistrationSex.this.butFemale.setImageResource(R.drawable.img_female_active);
                    UILayoutRegistrationSex.this.isMaleActive = false;
                }
            }
        });
        this.butPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationSex.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationSex.this.mRoot.mAnim);
                UILayoutRegistrationSex.this.mRoot.isMale = UILayoutRegistrationSex.this.isMaleActive;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 3);
                    jSONObject.put("r", !UILayoutRegistrationSex.this.isMaleActive ? 1 : 0);
                    UILayoutRegistrationSex.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationSex.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationSex.this.mViewRoot.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) UILayoutRegistrationSex.this.imgLogo.getLayoutParams();
                int height = (int) (UILayoutRegistrationSex.this.mViewRoot.getHeight() * 0.15f);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = height;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = height * 2;
                UILayoutRegistrationSex.this.imgLogo.setLayoutParams(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) UILayoutRegistrationSex.this.butMale.getLayoutParams();
                int height2 = (int) (UILayoutRegistrationSex.this.mViewRoot.getHeight() * 0.6f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = height2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = height2;
                UILayoutRegistrationSex.this.butMale.setLayoutParams(layoutParams2);
            }
        });
    }
}
