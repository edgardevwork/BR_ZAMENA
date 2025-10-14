package com.blackhub.bronline.game.gui.legacy;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderKeys;
import com.bless.client.R;
import com.google.android.material.tabs.TabLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BrAudioDialog extends DialogFragment implements ISAMPGUI {
    public JNIActivity mContext = null;
    public GUIManager mGUIManager = null;
    public TabLayout tabLayout;
    public ViewPager viewPager;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 9;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
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
        return new BrAudioDialog();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) throws JSONException {
        onAudioGuiClosed();
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Resources.NotFoundException {
        View viewInflate = inflater.inflate(R.layout.br_audio, (ViewGroup) null, false);
        this.tabLayout = (TabLayout) viewInflate.findViewById(R.id.br_audio_tabLayout);
        this.viewPager = (ViewPager) viewInflate.findViewById(R.id.br_audio_masterViewPager);
        BrAudioDialogAdapter brAudioDialogAdapter = new BrAudioDialogAdapter(getChildFragmentManager(), 0);
        brAudioDialogAdapter.addFragment("Радиостанция        ", BrAudioFragment.createInstance(1, this));
        brAudioDialogAdapter.addFragment("Библиотека        ", BrAudioFragment.createInstance(2, this));
        this.viewPager.setAdapter(brAudioDialogAdapter);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.mContext = (JNIActivity) getActivity();
        this.viewPager.setCurrentItem(0);
        View childAt = ((ViewGroup) this.tabLayout.getChildAt(0)).getChildAt(0);
        View childAt2 = ((ViewGroup) this.tabLayout.getChildAt(0)).getChildAt(1);
        childAt.setBackgroundResource(R.drawable.bg_rectangle_orange_black67_hgr_crtl10);
        childAt2.setBackgroundResource(R.drawable.bg_rectangle_black_hgr_crtr10);
        this.tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioDialog.1
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) throws JSONException {
                int position = tab.getPosition();
                View childAt3 = ((ViewGroup) BrAudioDialog.this.tabLayout.getChildAt(0)).getChildAt(0);
                View childAt4 = ((ViewGroup) BrAudioDialog.this.tabLayout.getChildAt(0)).getChildAt(1);
                if (position == 0) {
                    childAt3.setBackgroundResource(R.drawable.bg_rectangle_orange_black67_hgr_crtl10);
                    childAt4.setBackgroundResource(R.drawable.bg_rectangle_black_hgr_crtr10);
                } else if (position == 1) {
                    childAt3.setBackgroundResource(R.drawable.bg_rectangle_black_hgr_crtl10);
                    childAt4.setBackgroundResource(R.drawable.bg_rectangle_orange_black67_hgr_crtr10);
                }
                BrAudioDialog.this.onAudioGuiTabChanged(position);
            }
        });
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setDimAmount(0.4f);
        ((Button) viewInflate.findViewById(R.id.br_audio_close)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrAudioDialog.this.dismissAllowingStateLoss();
            }
        });
        return viewInflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) throws JSONException {
        int i;
        try {
            i = json.getInt("t");
        } catch (Exception unused) {
            i = -1;
        }
        try {
            if (i == 0) {
                final int i2 = json.getInt(TaxiOrderKeys.NUMBER_KEY);
                final int i3 = json.getInt("p");
                final byte b = (byte) json.getInt("b");
                final byte b2 = (byte) json.getInt("a");
                boolean z = json.getInt("e") != 0;
                final String string = json.getString("n");
                final String[] strArr = new String[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    strArr[i4] = json.getString("r" + i4);
                }
                final boolean z2 = z;
                new CountDownTimer(5000L, 250L) { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioDialog.3
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long l) {
                        ViewPager viewPager = BrAudioDialog.this.viewPager;
                        if (viewPager != null) {
                            BrAudioFragment brAudioFragment = (BrAudioFragment) ((BrAudioDialogAdapter) viewPager.getAdapter()).getItem(0);
                            BrAudioFragment brAudioFragment2 = (BrAudioFragment) ((BrAudioDialogAdapter) BrAudioDialog.this.viewPager.getAdapter()).getItem(1);
                            if (brAudioFragment == null || brAudioFragment2 == null || !brAudioFragment.mIsInited || !brAudioFragment2.mIsInited) {
                                return;
                            }
                            BrAudioFragment.mIsActivePlaying = b2;
                            brAudioFragment.setParametrs(i3, false, i2, b, string, z2, strArr, null);
                            brAudioFragment2.updatePlayAct();
                            cancel();
                        }
                    }
                }.start();
                return;
            }
            if (i != 1) {
                return;
            }
            int i5 = json.getInt(TaxiOrderKeys.NUMBER_KEY);
            int i6 = json.getInt("p");
            byte b3 = (byte) json.getInt("b");
            boolean z3 = json.getInt("s") != 0;
            byte b4 = (byte) json.getInt("a");
            boolean z4 = json.getInt("e") != 0;
            String string2 = json.getString("n");
            String[] strArr2 = new String[i5];
            int[] iArr = new int[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                strArr2[i7] = json.getString("m" + i7);
            }
            for (int i8 = 0; i8 < i5; i8++) {
                iArr[i8] = json.getInt("r" + i8);
            }
            BrAudioFragment brAudioFragment = (BrAudioFragment) ((BrAudioDialogAdapter) this.viewPager.getAdapter()).getItem(0);
            BrAudioFragment brAudioFragment2 = (BrAudioFragment) ((BrAudioDialogAdapter) this.viewPager.getAdapter()).getItem(1);
            BrAudioFragment.mIsActivePlaying = b4;
            brAudioFragment2.setParametrs(i6, z3, i5, b3, string2, z4, strArr2, iArr);
            brAudioFragment.updatePlayAct();
        } catch (Exception unused2) {
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mGUIManager = manager;
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

    public void onAudioGuiClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            this.mGUIManager.sendJsonData(9, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onAudioGuiTabChanged(int tab) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("b", tab);
            this.mGUIManager.sendJsonData(9, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onAudioGuiButClicked(int tab, int but, String search) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 2);
            jSONObject.put("a", tab);
            jSONObject.put("b", but);
            if (but == 8) {
                jSONObject.put("s", search);
            }
            this.mGUIManager.sendJsonData(9, jSONObject);
        } catch (Exception unused) {
        }
    }
}
