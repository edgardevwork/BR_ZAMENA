package com.blackhub.bronline.game.gui.legacy;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;
import com.bless.client.R;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BrFingerPrintDialog extends DialogFragment implements FingerprintApi.Callback, ISAMPGUI {
    public JNIActivity mContext = null;
    public GUIManager mGUIManager = null;
    public String textInfo;
    public TextView textStatus;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 12;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onFailure() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public static ISAMPGUI newInstance() {
        return new BrFingerPrintDialog();
    }

    public final void dismissWithDelay() {
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.legacy.BrFingerPrintDialog.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                BrFingerPrintDialog.this.OnExitButtClicked();
                BrFingerPrintDialog.this.mContext.Fapi.cancel();
                BrFingerPrintDialog.this.dismissAllowingStateLoss();
            }
        }, 1000L);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.br_fingerprint, (ViewGroup) null, false);
        this.mContext = (JNIActivity) getActivity();
        getDialog().getWindow().setDimAmount(0.0f);
        getDialog().getWindow().getDecorView().getBackground().setAlpha(0);
        getDialog().setCancelable(false);
        this.textStatus = (TextView) viewInflate.findViewById(R.id.br_fingerprint_text);
        Button button = (Button) viewInflate.findViewById(R.id.br_fingerprint_butt);
        this.textStatus.setText(this.textInfo);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrFingerPrintDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(BrFingerPrintDialog.this.getContext(), R.anim.button_click));
                BrFingerPrintDialog.this.dismissWithDelay();
            }
        });
        this.mContext.Fapi.start(this);
        return viewInflate;
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onSuccess(String publicKey) throws JSONException {
        if (publicKey != null) {
            OnScanResult(publicKey.replaceAll(StringUtils.f9903LF, "F").replace("\\", "F").replace("/", "F"));
        } else {
            onError(228);
        }
        dismissAllowingStateLoss();
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi.Callback
    public void onError(int errorCode) throws JSONException {
        OnScanResult("error");
        dismissAllowingStateLoss();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mGUIManager = manager;
        try {
            this.textInfo = json.getString("s");
        } catch (Exception e) {
            e.printStackTrace();
        }
        show(activity.getSupportFragmentManager(), "dialog");
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        dismissAllowingStateLoss();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        if (getDialog() != null) {
            return getDialog().isShowing();
        }
        return false;
    }

    public final void OnExitButtClicked() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            this.mGUIManager.sendJsonData(12, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OnScanResult(String key) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            jSONObject.put("k", key);
            this.mGUIManager.sendJsonData(12, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
