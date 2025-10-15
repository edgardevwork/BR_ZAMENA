package com.blackhub.bronline.game.gui.registration;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.common.UILayout;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UILayoutRegistrationPerson extends UILayout {
    public ImageView butLeft;
    public Button butPlay;
    public ImageView butRight;
    public ImageView imgClose;
    public ImageView imgPerson;
    public int[] mIds;
    public GUIRegistration mRoot;
    public TextView textHint;
    public View mViewRoot = null;
    public int[] mMaleIds = {78, 79, 134, 136, 230, Cea708Decoder.COMMAND_DF6, 159, 71, MatroskaExtractor.ID_BLOCK};
    public int[] mFemaleIds = {77, 135, Cea708Decoder.COMMAND_DSW, 212, 239, 218};
    public int mCurrId = 0;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationPerson(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.reg_person, (ViewGroup) null, false);
        this.mViewRoot = viewInflate;
        this.butLeft = (ImageView) viewInflate.findViewById(R.id.arrow_left);
        this.butRight = (ImageView) this.mViewRoot.findViewById(R.id.arrow_right);
        this.butPlay = (Button) this.mViewRoot.findViewById(R.id.play_butt);
        this.imgClose = (ImageView) this.mViewRoot.findViewById(R.id.person_close_h);
        this.imgPerson = (ImageView) this.mViewRoot.findViewById(R.id.perosn_img);
        this.textHint = (TextView) this.mViewRoot.findViewById(R.id.hint_person);
        this.butLeft.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationPerson.this.mRoot.mAnim);
                UILayoutRegistrationPerson uILayoutRegistrationPerson = UILayoutRegistrationPerson.this;
                int i = uILayoutRegistrationPerson.mCurrId - 1;
                uILayoutRegistrationPerson.mCurrId = i;
                if (i < 0) {
                    uILayoutRegistrationPerson.mCurrId = uILayoutRegistrationPerson.mIds.length - 1;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", -1);
                    UILayoutRegistrationPerson uILayoutRegistrationPerson2 = UILayoutRegistrationPerson.this;
                    jSONObject.put("i", uILayoutRegistrationPerson2.mIds[uILayoutRegistrationPerson2.mCurrId]);
                    UILayoutRegistrationPerson.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.butRight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationPerson.this.mRoot.mAnim);
                UILayoutRegistrationPerson uILayoutRegistrationPerson = UILayoutRegistrationPerson.this;
                int i = uILayoutRegistrationPerson.mCurrId + 1;
                uILayoutRegistrationPerson.mCurrId = i;
                if (i >= uILayoutRegistrationPerson.mIds.length) {
                    uILayoutRegistrationPerson.mCurrId = 0;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", -1);
                    UILayoutRegistrationPerson uILayoutRegistrationPerson2 = UILayoutRegistrationPerson.this;
                    jSONObject.put("i", uILayoutRegistrationPerson2.mIds[uILayoutRegistrationPerson2.mCurrId]);
                    UILayoutRegistrationPerson.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.butPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                view.startAnimation(UILayoutRegistrationPerson.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 5);
                    UILayoutRegistrationPerson uILayoutRegistrationPerson = UILayoutRegistrationPerson.this;
                    jSONObject.put("r", uILayoutRegistrationPerson.mIds[uILayoutRegistrationPerson.mCurrId]);
                    UILayoutRegistrationPerson.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                    UILayoutRegistrationPerson.this.mRoot.close(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.textHint.setText(Html.fromHtml("Теперь тебе предстоит выбрать персонажа. Нажимай <font color=#FFC634>«Влево»</font> и <font color=#FFC634>«Вправо»</font>, чтобы найти свой стиль."));
        this.textHint.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UILayoutRegistrationPerson.this.textHint.setVisibility(4);
                UILayoutRegistrationPerson.this.imgPerson.setVisibility(4);
                UILayoutRegistrationPerson.this.imgClose.setVisibility(4);
            }
        });
        this.imgClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UILayoutRegistrationPerson.this.imgClose.setVisibility(4);
                UILayoutRegistrationPerson.this.imgPerson.setVisibility(4);
                UILayoutRegistrationPerson.this.textHint.setVisibility(4);
            }
        });
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() throws JSONException {
        if (this.mRoot.isMale) {
            this.mIds = this.mMaleIds;
        } else {
            this.mIds = this.mFemaleIds;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", -1);
            jSONObject.put("i", this.mIds[0]);
            this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationPerson.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationPerson.this.mViewRoot.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) UILayoutRegistrationPerson.this.imgPerson.getLayoutParams();
                int height = (int) (UILayoutRegistrationPerson.this.mViewRoot.getHeight() * 0.5f);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = height;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = height;
                UILayoutRegistrationPerson.this.imgPerson.setLayoutParams(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) UILayoutRegistrationPerson.this.textHint.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) (UILayoutRegistrationPerson.this.imgPerson.getWidth() * (-0.3f));
                UILayoutRegistrationPerson.this.textHint.setLayoutParams(layoutParams2);
            }
        });
    }
}
