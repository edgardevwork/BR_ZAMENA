package com.blackhub.bronline.game.gui.brdialogwindow;

import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class BrDialogWindow implements ISAMPGUI {
    public GUIManager mManager = null;
    public PopupWindow mWindow = null;
    public JNIActivity mActivity = null;
    public View mView = null;
    public View mSelectedButton = null;
    public TextView mOrigButton = null;
    public int mClickedButton = -1;
    public CustomEditTextWithBackPressEvent mEditText = null;
    public String mListitemToSend = null;
    public boolean mIsTab = false;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 10;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogWindow();
    }

    public final String[] getSplittedStrings(String content) {
        return content.split(Pattern.quote(StringUtils.f9903LF));
    }

    public final String[] getSplittedTabs(String content) {
        return content.split(Pattern.quote("\t"));
    }

    public float[] calcuteStringsLength(TextView textView, String[] strings) {
        float[] fArr = new float[strings.length];
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        textPaint.setTypeface(textView.getTypeface());
        for (int i = 0; i < strings.length; i++) {
            fArr[i] = new StaticLayout(UsefulKt.transformColors(strings[i]), textPaint, 10000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineWidth(0) + 5.0f;
        }
        return fArr;
    }

    public final TextView createButtonFromOrig(TextView btn_orig, boolean margin, boolean tabbed) {
        TextView textView = new TextView(this.mActivity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (margin) {
            layoutParams.topMargin = IntExtensionKt.dpToPx(6, this.mActivity);
        }
        textView.setLayoutParams(layoutParams);
        textView.setBackground(btn_orig.getBackground());
        textView.setTypeface(btn_orig.getTypeface());
        textView.setGravity(btn_orig.getGravity());
        if (!tabbed) {
            textView.setPadding(btn_orig.getPaddingLeft(), btn_orig.getPaddingTop(), btn_orig.getPaddingRight(), btn_orig.getPaddingBottom());
        }
        textView.setAllCaps(false);
        textView.setTextColor(btn_orig.getTextColors().getDefaultColor());
        textView.setTextSize(0, btn_orig.getTextSize());
        return textView;
    }

    public final float[][] getColumnsWidth(TextView textView, String[] strings) {
        float[][] fArr = new float[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            String[] splittedTabs = getSplittedTabs(strings[i]);
            fArr[i] = new float[splittedTabs.length];
            for (int i2 = 0; i2 < splittedTabs.length; i2++) {
                textView.setText(UsefulKt.transformColors(splittedTabs[i2]));
                fArr[i][i2] = UsefulKt.getTextLength(textView) + IntExtensionKt.dpToPx(54, this.mActivity);
            }
        }
        return fArr;
    }

    public final float[] getMaxWidths(float[][] floats) {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = -1.0f;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            for (float[] fArr2 : floats) {
                if (i2 < fArr2.length) {
                    float f = fArr2[i2];
                    if (f >= fArr[i2]) {
                        fArr[i2] = f;
                    }
                }
            }
        }
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03bd A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:3:0x0008, B:5:0x0014, B:8:0x0059, B:21:0x009a, B:23:0x00e4, B:25:0x00ea, B:37:0x0101, B:121:0x03df, B:123:0x03f9, B:127:0x041f, B:128:0x0434, B:42:0x0136, B:44:0x015a, B:45:0x0169, B:47:0x016d, B:48:0x017a, B:50:0x0182, B:53:0x018f, B:54:0x0195, B:56:0x0198, B:57:0x01a1, B:58:0x01a6, B:60:0x01ac, B:62:0x01b7, B:64:0x01ba, B:67:0x01d7, B:69:0x01dd, B:72:0x01e2, B:73:0x01e5, B:75:0x01e8, B:78:0x01ef, B:79:0x01f2, B:81:0x020c, B:82:0x020f, B:84:0x0212, B:85:0x021e, B:87:0x0226, B:89:0x022b, B:90:0x0268, B:93:0x026d, B:95:0x027e, B:96:0x0287, B:97:0x02b9, B:99:0x02bc, B:106:0x02f6, B:108:0x0311, B:110:0x031b, B:111:0x0327, B:103:0x02e8, B:104:0x02ef, B:112:0x0330, B:116:0x033d, B:117:0x036b, B:119:0x0390, B:120:0x03bd, B:124:0x0415), top: B:142:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f9 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:3:0x0008, B:5:0x0014, B:8:0x0059, B:21:0x009a, B:23:0x00e4, B:25:0x00ea, B:37:0x0101, B:121:0x03df, B:123:0x03f9, B:127:0x041f, B:128:0x0434, B:42:0x0136, B:44:0x015a, B:45:0x0169, B:47:0x016d, B:48:0x017a, B:50:0x0182, B:53:0x018f, B:54:0x0195, B:56:0x0198, B:57:0x01a1, B:58:0x01a6, B:60:0x01ac, B:62:0x01b7, B:64:0x01ba, B:67:0x01d7, B:69:0x01dd, B:72:0x01e2, B:73:0x01e5, B:75:0x01e8, B:78:0x01ef, B:79:0x01f2, B:81:0x020c, B:82:0x020f, B:84:0x0212, B:85:0x021e, B:87:0x0226, B:89:0x022b, B:90:0x0268, B:93:0x026d, B:95:0x027e, B:96:0x0287, B:97:0x02b9, B:99:0x02bc, B:106:0x02f6, B:108:0x0311, B:110:0x031b, B:111:0x0327, B:103:0x02e8, B:104:0x02ef, B:112:0x0330, B:116:0x033d, B:117:0x036b, B:119:0x0390, B:120:0x03bd, B:124:0x0415), top: B:142:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0434 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:3:0x0008, B:5:0x0014, B:8:0x0059, B:21:0x009a, B:23:0x00e4, B:25:0x00ea, B:37:0x0101, B:121:0x03df, B:123:0x03f9, B:127:0x041f, B:128:0x0434, B:42:0x0136, B:44:0x015a, B:45:0x0169, B:47:0x016d, B:48:0x017a, B:50:0x0182, B:53:0x018f, B:54:0x0195, B:56:0x0198, B:57:0x01a1, B:58:0x01a6, B:60:0x01ac, B:62:0x01b7, B:64:0x01ba, B:67:0x01d7, B:69:0x01dd, B:72:0x01e2, B:73:0x01e5, B:75:0x01e8, B:78:0x01ef, B:79:0x01f2, B:81:0x020c, B:82:0x020f, B:84:0x0212, B:85:0x021e, B:87:0x0226, B:89:0x022b, B:90:0x0268, B:93:0x026d, B:95:0x027e, B:96:0x0287, B:97:0x02b9, B:99:0x02bc, B:106:0x02f6, B:108:0x0311, B:110:0x031b, B:111:0x0327, B:103:0x02e8, B:104:0x02ef, B:112:0x0330, B:116:0x033d, B:117:0x036b, B:119:0x0390, B:120:0x03bd, B:124:0x0415), top: B:142:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:3:0x0008, B:5:0x0014, B:8:0x0059, B:21:0x009a, B:23:0x00e4, B:25:0x00ea, B:37:0x0101, B:121:0x03df, B:123:0x03f9, B:127:0x041f, B:128:0x0434, B:42:0x0136, B:44:0x015a, B:45:0x0169, B:47:0x016d, B:48:0x017a, B:50:0x0182, B:53:0x018f, B:54:0x0195, B:56:0x0198, B:57:0x01a1, B:58:0x01a6, B:60:0x01ac, B:62:0x01b7, B:64:0x01ba, B:67:0x01d7, B:69:0x01dd, B:72:0x01e2, B:73:0x01e5, B:75:0x01e8, B:78:0x01ef, B:79:0x01f2, B:81:0x020c, B:82:0x020f, B:84:0x0212, B:85:0x021e, B:87:0x0226, B:89:0x022b, B:90:0x0268, B:93:0x026d, B:95:0x027e, B:96:0x0287, B:97:0x02b9, B:99:0x02bc, B:106:0x02f6, B:108:0x0311, B:110:0x031b, B:111:0x0327, B:103:0x02e8, B:104:0x02ef, B:112:0x0330, B:116:0x033d, B:117:0x036b, B:119:0x0390, B:120:0x03bd, B:124:0x0415), top: B:142:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void show(JSONObject jSONObject, GUIManager gUIManager, final JNIActivity jNIActivity) throws JSONException {
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        Button button;
        boolean z;
        boolean z2;
        final String[] strArr;
        String str;
        String[] strArr2;
        boolean z3;
        TextView textView;
        TextView textViewCreateButtonFromOrig;
        try {
            this.mManager = gUIManager;
            this.mActivity = jNIActivity;
            if (this.mWindow == null) {
                this.mView = ((LayoutInflater) jNIActivity.getSystemService("layout_inflater")).inflate(R.layout.window_dialog, (ViewGroup) null, false);
                PopupWindow popupWindow = new PopupWindow(this.mView, -2, -2, true);
                this.mWindow = popupWindow;
                popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
                this.mWindow.setSoftInputMode(16);
                this.mWindow.setFocusable(true);
                this.mWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.1
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            if (motionEvent.getX() < 0.0f || motionEvent.getX() > view.getWidth()) {
                                ((InputMethodManager) BrDialogWindow.this.mActivity.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                BrDialogWindow.this.mEditText.setFocusable(false);
                                BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                                return true;
                            }
                            if (motionEvent.getY() < 0.0f || motionEvent.getY() > view.getHeight()) {
                                ((InputMethodManager) BrDialogWindow.this.mActivity.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                BrDialogWindow.this.mEditText.setFocusable(false);
                                BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                                return true;
                            }
                        }
                        return false;
                    }
                });
                this.mWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.2
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() throws JSONException {
                        if (!BrDialogWindow.this.mIsTab) {
                            BrDialogWindow.this.sendResponse(0);
                        }
                        BrDialogWindow.this.mIsTab = false;
                        BrDialogWindow.this.mWindow.setFocusable(false);
                    }
                });
            }
            this.mClickedButton = -1;
            this.mListitemToSend = null;
            DialogWindowUsefulKt.makeAllViewsVisible((ViewGroup) this.mView.findViewById(R.id.dw_root));
            try {
                i = jSONObject.getInt("i");
                try {
                    string = jSONObject.getString("c");
                    try {
                        string2 = jSONObject.getString("s");
                        try {
                            string3 = jSONObject.getString("l");
                            try {
                                string4 = jSONObject.getString("r");
                            } catch (Exception unused) {
                                string4 = null;
                                Button button2 = (Button) this.mView.findViewById(R.id.dw_button_ok);
                                button = (Button) this.mView.findViewById(R.id.dw_button_cancel);
                                TextView textView2 = (TextView) this.mView.findViewById(R.id.dw_caption);
                                CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) this.mView.findViewById(R.id.dw_edittext);
                                this.mEditText = customEditTextWithBackPressEvent;
                                JNIHelper.fixEditTextForAndroid10Xiaomi(customEditTextWithBackPressEvent);
                                button2.setText(UsefulKt.transformColors(string3));
                                button.setText(UsefulKt.transformColors(string4));
                                textView2.setText(UsefulKt.transformColors(string));
                                if (string4 != null) {
                                    button.setVisibility(8);
                                }
                                if (i == 3) {
                                }
                                if (i != 4) {
                                }
                                if (i != 5) {
                                }
                                button2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.3
                                    @Override // android.view.View.OnClickListener
                                    public void onClick(View view) throws JSONException {
                                        BrDialogWindow.this.mIsTab = true;
                                        BrDialogWindow.this.sendResponse(1);
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.4
                                    @Override // android.view.View.OnClickListener
                                    public void onClick(View view) throws JSONException {
                                        BrDialogWindow.this.mIsTab = true;
                                        BrDialogWindow.this.sendResponse(0);
                                    }
                                });
                                Log.i("AndreiKrayushkin", "type = " + i);
                                if (i != 0) {
                                }
                                this.mEditText.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.7
                                    @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
                                    public void callback() {
                                        JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                                        JNIActivity unused2 = BrDialogWindow.this.mActivity;
                                        ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                        BrDialogWindow.this.mEditText.setFocusable(false);
                                        BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                                    }
                                });
                                this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.8
                                    @Override // android.view.View.OnKeyListener
                                    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                                        if (i2 != 66) {
                                            return false;
                                        }
                                        JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                                        JNIActivity unused2 = BrDialogWindow.this.mActivity;
                                        ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                        BrDialogWindow.this.mEditText.setFocusable(false);
                                        BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                                        return true;
                                    }
                                });
                                if (!UsefulKt.isActivityValid(jNIActivity)) {
                                }
                            }
                        } catch (Exception unused2) {
                            string3 = null;
                        }
                    } catch (Exception unused3) {
                        string2 = null;
                        string3 = string2;
                        string4 = null;
                        Button button22 = (Button) this.mView.findViewById(R.id.dw_button_ok);
                        button = (Button) this.mView.findViewById(R.id.dw_button_cancel);
                        TextView textView22 = (TextView) this.mView.findViewById(R.id.dw_caption);
                        CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent2 = (CustomEditTextWithBackPressEvent) this.mView.findViewById(R.id.dw_edittext);
                        this.mEditText = customEditTextWithBackPressEvent2;
                        JNIHelper.fixEditTextForAndroid10Xiaomi(customEditTextWithBackPressEvent2);
                        button22.setText(UsefulKt.transformColors(string3));
                        button.setText(UsefulKt.transformColors(string4));
                        textView22.setText(UsefulKt.transformColors(string));
                        if (string4 != null) {
                        }
                        if (i == 3) {
                        }
                        if (i != 4) {
                        }
                        if (i != 5) {
                        }
                        button22.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.3
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) throws JSONException {
                                BrDialogWindow.this.mIsTab = true;
                                BrDialogWindow.this.sendResponse(1);
                            }
                        });
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.4
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) throws JSONException {
                                BrDialogWindow.this.mIsTab = true;
                                BrDialogWindow.this.sendResponse(0);
                            }
                        });
                        Log.i("AndreiKrayushkin", "type = " + i);
                        if (i != 0) {
                        }
                        this.mEditText.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.7
                            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
                            public void callback() {
                                JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                                JNIActivity unused22 = BrDialogWindow.this.mActivity;
                                ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                BrDialogWindow.this.mEditText.setFocusable(false);
                                BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                            }
                        });
                        this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.8
                            @Override // android.view.View.OnKeyListener
                            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                                if (i2 != 66) {
                                    return false;
                                }
                                JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                                JNIActivity unused22 = BrDialogWindow.this.mActivity;
                                ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                                BrDialogWindow.this.mEditText.setFocusable(false);
                                BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                                return true;
                            }
                        });
                        if (!UsefulKt.isActivityValid(jNIActivity)) {
                        }
                    }
                } catch (Exception unused4) {
                    string = null;
                    string2 = null;
                    string3 = string2;
                    string4 = null;
                    Button button222 = (Button) this.mView.findViewById(R.id.dw_button_ok);
                    button = (Button) this.mView.findViewById(R.id.dw_button_cancel);
                    TextView textView222 = (TextView) this.mView.findViewById(R.id.dw_caption);
                    CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent22 = (CustomEditTextWithBackPressEvent) this.mView.findViewById(R.id.dw_edittext);
                    this.mEditText = customEditTextWithBackPressEvent22;
                    JNIHelper.fixEditTextForAndroid10Xiaomi(customEditTextWithBackPressEvent22);
                    button222.setText(UsefulKt.transformColors(string3));
                    button.setText(UsefulKt.transformColors(string4));
                    textView222.setText(UsefulKt.transformColors(string));
                    if (string4 != null) {
                    }
                    if (i == 3) {
                    }
                    if (i != 4) {
                    }
                    if (i != 5) {
                    }
                    button222.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) throws JSONException {
                            BrDialogWindow.this.mIsTab = true;
                            BrDialogWindow.this.sendResponse(1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) throws JSONException {
                            BrDialogWindow.this.mIsTab = true;
                            BrDialogWindow.this.sendResponse(0);
                        }
                    });
                    Log.i("AndreiKrayushkin", "type = " + i);
                    if (i != 0) {
                    }
                    this.mEditText.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.7
                        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
                        public void callback() {
                            JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                            JNIActivity unused22 = BrDialogWindow.this.mActivity;
                            ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                            BrDialogWindow.this.mEditText.setFocusable(false);
                            BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                        }
                    });
                    this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.8
                        @Override // android.view.View.OnKeyListener
                        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                            if (i2 != 66) {
                                return false;
                            }
                            JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                            JNIActivity unused22 = BrDialogWindow.this.mActivity;
                            ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                            BrDialogWindow.this.mEditText.setFocusable(false);
                            BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                            return true;
                        }
                    });
                    if (!UsefulKt.isActivityValid(jNIActivity)) {
                    }
                }
            } catch (Exception unused5) {
                i = -1;
            }
            Button button2222 = (Button) this.mView.findViewById(R.id.dw_button_ok);
            button = (Button) this.mView.findViewById(R.id.dw_button_cancel);
            TextView textView2222 = (TextView) this.mView.findViewById(R.id.dw_caption);
            CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent222 = (CustomEditTextWithBackPressEvent) this.mView.findViewById(R.id.dw_edittext);
            this.mEditText = customEditTextWithBackPressEvent222;
            JNIHelper.fixEditTextForAndroid10Xiaomi(customEditTextWithBackPressEvent222);
            button2222.setText(UsefulKt.transformColors(string3));
            button.setText(UsefulKt.transformColors(string4));
            textView2222.setText(UsefulKt.transformColors(string));
            if (string4 != null && string4.length() == 0) {
                button.setVisibility(8);
            }
            if (i == 3) {
                i = 1;
            }
            if (i != 4) {
                i = 2;
                z = true;
            } else {
                z = false;
            }
            if (i != 5) {
                i = 2;
                z = true;
                z2 = true;
            } else {
                z2 = false;
            }
            button2222.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    BrDialogWindow.this.mIsTab = true;
                    BrDialogWindow.this.sendResponse(1);
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    BrDialogWindow.this.mIsTab = true;
                    BrDialogWindow.this.sendResponse(0);
                }
            });
            Log.i("AndreiKrayushkin", "type = " + i);
            if (i != 0) {
                this.mEditText.setVisibility(8);
                this.mView.findViewById(R.id.dw_scroll_root).setVisibility(8);
                TextView textView3 = (TextView) this.mView.findViewById(R.id.dw_info);
                textView3.setText(UsefulKt.transformColors(string2));
                DialogWindowUsefulKt.changeTextViewWidth(textView3);
            } else if (i == 1) {
                this.mWindow.setFocusable(true);
                this.mView.findViewById(R.id.dw_scroll_root).setVisibility(8);
                TextView textView4 = (TextView) this.mView.findViewById(R.id.dw_info);
                textView4.setText(UsefulKt.transformColors(string2));
                DialogWindowUsefulKt.changeTextViewWidth(textView4);
                this.mEditText.getEditableText().clear();
            } else if (i == 2) {
                this.mWindow.setFocusable(true);
                final LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.dw_header);
                this.mView.findViewById(R.id.dw_scroll_info).setVisibility(8);
                this.mEditText.setVisibility(8);
                if (!z2) {
                    this.mView.findViewById(R.id.dw_divider).setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                if (this.mOrigButton == null) {
                    this.mOrigButton = (TextView) this.mView.findViewById(R.id.dw_list_button);
                }
                TextView textView5 = this.mOrigButton;
                String[] splittedStrings = getSplittedStrings(string2);
                float[] maxWidths = z ? getMaxWidths(getColumnsWidth(textView5, splittedStrings)) : null;
                if (z2) {
                    str = splittedStrings[0];
                    String[] strArr3 = new String[splittedStrings.length - 1];
                    for (int i2 = 1; i2 < splittedStrings.length; i2++) {
                        strArr3[i2 - 1] = splittedStrings[i2];
                    }
                    String[] splittedTabs = getSplittedTabs(str);
                    for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
                        linearLayout.getChildAt(i3).setVisibility(8);
                    }
                    for (int i4 = 0; i4 < splittedTabs.length; i4++) {
                        TextView textView6 = (TextView) linearLayout.getChildAt(i4);
                        textView6.setText(UsefulKt.transformColors(splittedTabs[i4]));
                        textView6.setVisibility(0);
                    }
                    strArr = strArr3;
                    strArr2 = splittedTabs;
                } else {
                    strArr = splittedStrings;
                    str = null;
                    strArr2 = null;
                }
                float[] fArrCalcuteStringsLength = calcuteStringsLength(textView5, strArr);
                if (fArrCalcuteStringsLength != null && fArrCalcuteStringsLength.length != 0) {
                    float f = fArrCalcuteStringsLength[0];
                    for (float f2 : fArrCalcuteStringsLength) {
                        if (f2 > f) {
                            f = f2;
                        }
                    }
                    final View viewFindViewById = this.mView.findViewById(R.id.dw_scroll_root);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
                    layoutParams.width = ((int) f) + IntExtensionKt.dpToPx(54, this.mActivity);
                    if (z) {
                        layoutParams.width = 0;
                        for (float f3 : maxWidths) {
                            layoutParams.width = (int) (layoutParams.width + f3);
                        }
                    }
                    int textLength = UsefulKt.getTextLength(textView2222);
                    if (layoutParams.width < textLength) {
                        layoutParams.width = textLength;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    viewFindViewById.setLayoutParams(layoutParams);
                    final ViewGroup viewGroup = (ViewGroup) this.mView.findViewById(R.id.dw_root);
                    final LinearLayout linearLayout2 = (LinearLayout) this.mView.findViewById(R.id.dw_scroll_layout);
                    final float[] fArr = maxWidths;
                    final boolean z4 = z3;
                    TextView textView7 = textView5;
                    final String[] strArr4 = strArr2;
                    viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.5
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            if (viewGroup.getWidth() > viewFindViewById.getWidth() && z4) {
                                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                                layoutParams2.width = -1;
                                viewFindViewById.setLayoutParams(layoutParams2);
                            }
                            if (viewGroup.findViewById(R.id.dw_root_buttons).getWidth() > viewFindViewById.getWidth()) {
                                ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                                layoutParams3.width = -1;
                                viewFindViewById.setLayoutParams(layoutParams3);
                            }
                            float[] fArr2 = fArr;
                            if (fArr2 != null) {
                                int length = fArr2.length;
                                float[] fArr3 = new float[length];
                                for (int i5 = 0; i5 < length; i5++) {
                                    fArr3[i5] = fArr[i5] / viewFindViewById.getWidth();
                                }
                                if (strArr4 != null) {
                                    int i6 = 0;
                                    while (i6 < strArr4.length) {
                                        TextView textView8 = (TextView) linearLayout.getChildAt(i6);
                                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) textView8.getLayoutParams();
                                        layoutParams4.weight = 1.0f - (i6 < length ? fArr3[i6] : 0.0f);
                                        textView8.setLayoutParams(layoutParams4);
                                        i6++;
                                    }
                                }
                                for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                                    if (linearLayout2.getChildAt(i7) instanceof LinearLayout) {
                                        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.getChildAt(i7);
                                        int i8 = 0;
                                        while (i8 < linearLayout3.getChildCount()) {
                                            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) linearLayout3.getChildAt(i8).getLayoutParams();
                                            layoutParams5.weight = 1.0f - (i8 < length ? fArr3[i8] : 0.0f);
                                            linearLayout3.getChildAt(i8).setLayoutParams(layoutParams5);
                                            i8++;
                                        }
                                    }
                                }
                            }
                        }
                    });
                    linearLayout2.removeAllViews();
                    final int i5 = 0;
                    while (i5 < strArr.length) {
                        if (z) {
                            LinearLayout linearLayout3 = new LinearLayout(this.mActivity);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            if (i5 >= 1) {
                                layoutParams2.topMargin = IntExtensionKt.dpToPx(6, this.mActivity);
                            }
                            linearLayout3.setLayoutParams(layoutParams2);
                            linearLayout3.setOrientation(0);
                            linearLayout3.setPadding(textView7.getPaddingLeft(), textView7.getPaddingTop(), textView7.getPaddingRight(), textView7.getPaddingBottom());
                            linearLayout3.setBackground(ResourcesCompat.getDrawable(this.mActivity.getResources(), R.drawable.bg_rectangle_black40_cr4, null));
                            String[] splittedTabs2 = getSplittedTabs(strArr[i5]);
                            int i6 = 0;
                            while (i6 < splittedTabs2.length) {
                                TextView textView8 = textView7;
                                TextView textViewCreateButtonFromOrig2 = createButtonFromOrig(textView8, false, true);
                                textViewCreateButtonFromOrig2.setText(UsefulKt.transformColors(splittedTabs2[i6]));
                                textViewCreateButtonFromOrig2.setBackground(new ColorDrawable());
                                linearLayout3.addView(textViewCreateButtonFromOrig2);
                                i6++;
                                textView7 = textView8;
                            }
                            textView = textView7;
                            textViewCreateButtonFromOrig = linearLayout3;
                        } else {
                            textView = textView7;
                            if (i5 >= 1) {
                                textViewCreateButtonFromOrig = createButtonFromOrig(textView, true, false);
                            } else {
                                textViewCreateButtonFromOrig = createButtonFromOrig(textView, false, false);
                            }
                        }
                        if (i5 == 0) {
                            this.mSelectedButton = textViewCreateButtonFromOrig;
                            this.mClickedButton = i5;
                            this.mListitemToSend = strArr[i5];
                            textViewCreateButtonFromOrig.setBackground(ResourcesCompat.getDrawable(this.mActivity.getResources(), R.drawable.bg_rectangle_orange_hgr_cr4_1, null));
                        }
                        textViewCreateButtonFromOrig.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.6
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) throws JSONException {
                                if (BrDialogWindow.this.mSelectedButton != view) {
                                    if (BrDialogWindow.this.mSelectedButton != null) {
                                        BrDialogWindow.this.mSelectedButton.setBackground(ResourcesCompat.getDrawable(BrDialogWindow.this.mActivity.getResources(), R.drawable.bg_rectangle_black40_cr4, null));
                                    }
                                    BrDialogWindow.this.mSelectedButton = view;
                                    BrDialogWindow.this.mClickedButton = i5;
                                    BrDialogWindow.this.mListitemToSend = strArr[i5];
                                    BrDialogWindow.this.mSelectedButton.setBackground(ResourcesCompat.getDrawable(BrDialogWindow.this.mActivity.getResources(), R.drawable.bg_rectangle_orange_hgr_cr4_1, null));
                                    BrDialogWindow.this.mSelectedButton.startAnimation(AnimationUtils.loadAnimation(BrDialogWindow.this.mActivity, R.anim.button_click));
                                    return;
                                }
                                BrDialogWindow.this.mClickedButton = i5;
                                BrDialogWindow.this.mIsTab = true;
                                BrDialogWindow.this.sendResponse(1);
                                BrDialogWindow.this.mSelectedButton = null;
                            }
                        });
                        if (!z) {
                            textViewCreateButtonFromOrig.setText(UsefulKt.transformColors(strArr[i5]));
                        }
                        linearLayout2.addView(textViewCreateButtonFromOrig);
                        i5++;
                        textView7 = textView;
                    }
                    textView7.setVisibility(8);
                }
                if (str != null) {
                    FirebaseCrashlytics.getInstance().recordException(new RuntimeException("HEADER " + str + "widths length 0 dialog text " + strArr.length + " button" + string3));
                    return;
                }
                FirebaseCrashlytics.getInstance().recordException(new RuntimeException("NO HEADER widths length 0 dialog text " + strArr.length + " button" + string3));
                return;
            }
            this.mEditText.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.7
                @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
                public void callback() {
                    JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                    JNIActivity unused22 = BrDialogWindow.this.mActivity;
                    ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                    BrDialogWindow.this.mEditText.setFocusable(false);
                    BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                }
            });
            this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.8
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i22, KeyEvent keyEvent) {
                    if (i22 != 66) {
                        return false;
                    }
                    JNIActivity jNIActivity2 = BrDialogWindow.this.mActivity;
                    JNIActivity unused22 = BrDialogWindow.this.mActivity;
                    ((InputMethodManager) jNIActivity2.getSystemService("input_method")).hideSoftInputFromWindow(BrDialogWindow.this.mEditText.getWindowToken(), 0);
                    BrDialogWindow.this.mEditText.setFocusable(false);
                    BrDialogWindow.this.mEditText.setFocusableInTouchMode(true);
                    return true;
                }
            });
            if (!UsefulKt.isActivityValid(jNIActivity)) {
                UtilsKt.crashlyticsLog("BrDialogWindow getCurrentState1: " + jNIActivity.getLifecycle().getState());
                try {
                    jNIActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.lambda$show$0(jNIActivity);
                        }
                    });
                    return;
                } catch (Exception e) {
                    UtilsKt.crashlyticsRecordNewException("BrDialogWindow1 " + e);
                    return;
                }
            }
            UtilsKt.crashlyticsRecordNewException("BrDialogWindow activity.isFinishing()" + jNIActivity.isFinishing() + "activity.isDestroyed()" + jNIActivity.isDestroyed());
            UtilsKt.crashlyticsLog("activity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) IS NOT TRUE");
        } catch (Exception e2) {
            UtilsKt.crashlyticsRecordNewException("BrDialogWindow2 " + e2);
        }
    }

    public final /* synthetic */ void lambda$show$0(JNIActivity jNIActivity) {
        UtilsKt.crashlyticsLog("BrDialogWindow getCurrentState2: " + jNIActivity.getLifecycle().getState());
        if (UsefulKt.isActivityValid(jNIActivity)) {
            UtilsKt.crashlyticsLog("BrDialogWindow activity is VALID. SHOW()");
            this.mWindow.showAtLocation(jNIActivity.getParentLayout(), 17, 0, 0);
        }
    }

    public final void sendResponse(int button) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("r", button);
            String str = this.mListitemToSend;
            if (str != null) {
                String strReplaceAll = getSplittedTabs(str)[0];
                for (int i2 = 0; i2 < strReplaceAll.length(); i2++) {
                    if (strReplaceAll.charAt(i2) == '{' && (i = i2 + 7) < strReplaceAll.length() && strReplaceAll.charAt(i) == '}') {
                        strReplaceAll = strReplaceAll.replaceAll(Pattern.quote(strReplaceAll.substring(i2, i2 + 8)), "");
                    }
                }
                jSONObject.put("i", strReplaceAll);
                this.mListitemToSend = null;
            } else {
                jSONObject.put("i", this.mEditText.getText().toString());
            }
            jSONObject.put("l", this.mClickedButton);
        } catch (Exception unused) {
        }
        this.mManager.sendJsonData(10, jSONObject);
        this.mManager.closeSAMPWindow(null);
        this.mClickedButton = -1;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow == null) {
            return false;
        }
        return popupWindow.isShowing();
    }
}
