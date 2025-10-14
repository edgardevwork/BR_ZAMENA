package com.blackhub.bronline.game.gui.plates;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import io.ktor.util.date.GMTDateParser;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes7.dex */
public class BrDialogPlates extends DialogFragment implements ISAMPGUI {
    public Button[] mButtonsCountry;
    public AppCompatEditText[] mEditTexts;
    public AppCompatEditText mEtRegKz;
    public AppCompatEditText mEtRegRu;
    public LinearLayout[] mLayoutList;
    public JNIActivity mContext = null;
    public GUIManager mGUIManager = null;
    public LinearLayout mLayoutMain1 = null;
    public LinearLayout mLayoutMain2 = null;
    public TextView mPlatesFormat = null;
    public TextView mPlatesAllowed = null;
    public TextView mPlatesPrice = null;
    public TextView mPlatesRefreshText = null;
    public TextView mPlatesHint = null;
    public Button mButtonRefresh = null;
    public int mChosenCountry = -1;
    public int mType = -1;
    public char[] mAllowedLower = {'a', 'b', 'c', 'e', GMTDateParser.HOURS, 'k', GMTDateParser.MINUTES, 'o', 'p', 't', 'x', 'y', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public char[] mAllowedHighUa = {'A', 'B', 'C', 'E', 'H', 'K', GMTDateParser.MONTH, 'O', 'P', 'T', 'X', GMTDateParser.YEAR, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};
    public char[] mAllowedHighBy = {'A', 'B', 'C', 'E', 'H', 'K', GMTDateParser.MONTH, 'O', 'P', 'T', 'X', GMTDateParser.YEAR, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '-'};
    public char[] mAllowedReg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 1;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogPlates();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mChosenCountry = -1;
        setStyle(0, R.style.CustomDialog);
    }

    public void setPricesBC(int pricePlate, int priceRefresh) {
        this.mPlatesPrice.setText(getString(R.string.plates_price_bc, Integer.valueOf(pricePlate)));
        this.mPlatesRefreshText.setText(getString(R.string.plates_change_plate_price_bc, Integer.valueOf(priceRefresh)));
    }

    public void setPricesRub(int pricePlate, int priceRefresh) {
        this.mPlatesPrice.setText(getString(R.string.plates_price_rub, Integer.valueOf(pricePlate)));
        this.mPlatesRefreshText.setText(getString(R.string.plates_change_plate_price_rub, Integer.valueOf(priceRefresh)));
    }

    public void setHint(String str) {
        this.mPlatesHint.setText(str);
    }

    public final void resetButtonsCountry(int ignore) {
        if (this.mChosenCountry == -1) {
            this.mLayoutMain2.setVisibility(8);
            this.mLayoutMain1.setVisibility(0);
        }
        if (ignore != 0) {
            this.mButtonsCountry[0].setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_lbutton_up_unselected));
        }
        if (ignore != 1) {
            this.mButtonsCountry[1].setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_rbutton_up_unselected));
        }
        if (ignore != 2) {
            this.mButtonsCountry[2].setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_lbutton_down_unselected));
        }
        if (ignore != 3) {
            this.mButtonsCountry[3].setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_rbutton_down_unselected));
        }
    }

    public void sendChangedPlate() throws JSONException {
        String string;
        int i = this.mChosenCountry;
        if (i == -1) {
            return;
        }
        String string2 = this.mEditTexts[i].getText().toString();
        if (this.mChosenCountry != 0) {
            string = "tt";
        } else {
            string = this.mEtRegRu.getText().toString();
        }
        if (this.mChosenCountry == 3) {
            string = this.mEtRegKz.getText().toString();
        }
        onPlateChangedText(this.mChosenCountry, string2, string);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mChosenCountry = -1;
        View viewInflate = inflater.inflate(R.layout.br_platebuy, (ViewGroup) null, false);
        this.mContext = (JNIActivity) getContext();
        this.mGUIManager = GUIManager.getInstance();
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setDimAmount(0.0f);
        getDialog().getWindow().setLayout(-1, -1);
        this.mButtonsCountry = new Button[4];
        LinearLayout[] linearLayoutArr = new LinearLayout[4];
        this.mLayoutList = linearLayoutArr;
        this.mEditTexts = new AppCompatEditText[4];
        linearLayoutArr[0] = (LinearLayout) viewInflate.findViewById(R.id.ru_layout);
        this.mLayoutList[1] = (LinearLayout) viewInflate.findViewById(R.id.ua_layout);
        this.mLayoutList[2] = (LinearLayout) viewInflate.findViewById(R.id.by_layout);
        this.mLayoutList[3] = (LinearLayout) viewInflate.findViewById(R.id.kz_layout);
        this.mEditTexts[0] = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_et_ru);
        this.mEditTexts[1] = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_et_ua);
        this.mEditTexts[2] = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_et_by);
        this.mEditTexts[3] = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_et_kz);
        TextWatcher textWatcher = new TextWatcher() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.1
            public boolean _ignore = false;
            public boolean resetChanges = false;
            public String remembered = null;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (this._ignore) {
                    return;
                }
                this.remembered = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (this._ignore) {
                    return;
                }
                BrDialogPlates brDialogPlates = BrDialogPlates.this;
                char[] cArr = brDialogPlates.mAllowedLower;
                if (brDialogPlates.mChosenCountry == 1) {
                    cArr = BrDialogPlates.this.mAllowedHighUa;
                }
                if (BrDialogPlates.this.mChosenCountry == 2) {
                    cArr = BrDialogPlates.this.mAllowedHighBy;
                }
                if (!BrDialogPlates.this.isNumberValid(charSequence.toString(), cArr)) {
                    this.resetChanges = true;
                } else {
                    this.resetChanges = false;
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) throws JSONException {
                if (this._ignore) {
                    BrDialogPlates.this.sendChangedPlate();
                    return;
                }
                if (this.resetChanges) {
                    this._ignore = true;
                    editable.clear();
                    editable.insert(0, this.remembered);
                    BrDialogPlates brDialogPlates = BrDialogPlates.this;
                    brDialogPlates.setHint(brDialogPlates.getString(R.string.plates_you_use_incorrect_symbols));
                    this._ignore = false;
                } else if (BrDialogPlates.this.mChosenCountry == 0) {
                    BrDialogPlates.this.isRuNumber(editable.toString());
                } else if (BrDialogPlates.this.mChosenCountry == 1) {
                    BrDialogPlates.this.isUANumber(editable.toString());
                } else if (BrDialogPlates.this.mChosenCountry == 2) {
                    BrDialogPlates.this.isBYNumber(editable.toString());
                } else if (BrDialogPlates.this.mChosenCountry == 3) {
                    BrDialogPlates.this.isKZNumber(editable.toString());
                }
                BrDialogPlates.this.sendChangedPlate();
            }
        };
        TextWatcher textWatcher2 = new TextWatcher() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.2
            public boolean _ignore = false;
            public boolean resetChanges = false;
            public String remembered = null;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (this._ignore) {
                    return;
                }
                this.remembered = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (this._ignore) {
                    return;
                }
                if (!BrDialogPlates.this.isRegCorrect(charSequence.toString())) {
                    this.resetChanges = true;
                } else {
                    this.resetChanges = false;
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) throws JSONException {
                if (this._ignore) {
                    BrDialogPlates.this.sendChangedPlate();
                    return;
                }
                if (this.resetChanges) {
                    this._ignore = true;
                    editable.clear();
                    editable.insert(0, this.remembered);
                    BrDialogPlates brDialogPlates = BrDialogPlates.this;
                    brDialogPlates.setHint(brDialogPlates.getString(R.string.plates_use_correct_symbols));
                    this._ignore = false;
                }
                BrDialogPlates.this.sendChangedPlate();
            }
        };
        for (int i = 0; i < 4; i++) {
            this.mEditTexts[i].addTextChangedListener(textWatcher);
        }
        this.mEtRegRu = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_reg_ru_et);
        AppCompatEditText appCompatEditText = (AppCompatEditText) viewInflate.findViewById(R.id.br_plate_reg_kz_et);
        this.mEtRegKz = appCompatEditText;
        appCompatEditText.addTextChangedListener(textWatcher2);
        this.mEtRegRu.addTextChangedListener(textWatcher2);
        this.mPlatesHint = (TextView) viewInflate.findViewById(R.id.br_plates_hint);
        this.mButtonsCountry[0] = (Button) viewInflate.findViewById(R.id.br_plates_rus);
        this.mButtonsCountry[1] = (Button) viewInflate.findViewById(R.id.br_plates_ua);
        this.mButtonsCountry[2] = (Button) viewInflate.findViewById(R.id.br_plates_by);
        this.mButtonsCountry[3] = (Button) viewInflate.findViewById(R.id.br_plates_kz);
        this.mPlatesFormat = (TextView) viewInflate.findViewById(R.id.br_plates_format);
        this.mPlatesAllowed = (TextView) viewInflate.findViewById(R.id.br_plates_allowed);
        this.mLayoutMain1 = (LinearLayout) viewInflate.findViewById(R.id.br_plate_main_1);
        this.mLayoutMain2 = (LinearLayout) viewInflate.findViewById(R.id.br_plate_main_2);
        this.mLayoutMain1.setVisibility(8);
        this.mLayoutMain2.setVisibility(0);
        this.mPlatesPrice = (TextView) viewInflate.findViewById(R.id.br_plates_price);
        this.mPlatesRefreshText = (TextView) viewInflate.findViewById(R.id.br_plates_price_refresh);
        Button button = (Button) viewInflate.findViewById(R.id.br_plates_button_refresh);
        this.mButtonRefresh = button;
        if (this.mType == 1) {
            button.setVisibility(8);
            this.mPlatesRefreshText.setVisibility(8);
        }
        this.mButtonsCountry[0].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.resetButtonsCountry(0);
                if (BrDialogPlates.this.mChosenCountry == 0) {
                    return;
                }
                BrDialogPlates.this.mChosenCountry = 0;
                view.setBackground(ContextCompat.getDrawable(BrDialogPlates.this.getContext(), R.drawable.bg_lbutton_up_selected));
                BrDialogPlates.this.onRusChosen();
            }
        });
        this.mButtonsCountry[1].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.resetButtonsCountry(1);
                if (BrDialogPlates.this.mChosenCountry == 1) {
                    return;
                }
                BrDialogPlates.this.mChosenCountry = 1;
                view.setBackground(ContextCompat.getDrawable(BrDialogPlates.this.getContext(), R.drawable.bg_rbutton_up_selected));
                BrDialogPlates.this.onUaChosen();
            }
        });
        this.mButtonsCountry[2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.resetButtonsCountry(2);
                if (BrDialogPlates.this.mChosenCountry == 2) {
                    return;
                }
                BrDialogPlates.this.mChosenCountry = 2;
                view.setBackground(ContextCompat.getDrawable(BrDialogPlates.this.getContext(), R.drawable.bg_lbutton_down_selected));
                BrDialogPlates.this.onBuChosen();
            }
        });
        this.mButtonsCountry[3].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.resetButtonsCountry(3);
                if (BrDialogPlates.this.mChosenCountry == 3) {
                    return;
                }
                BrDialogPlates.this.mChosenCountry = 3;
                view.setBackground(ContextCompat.getDrawable(BrDialogPlates.this.getContext(), R.drawable.bg_rbutton_down_selected));
                BrDialogPlates.this.onKzChosen();
            }
        });
        ((Button) viewInflate.findViewById(R.id.br_plates_exit)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.onPlateGuiClosed();
                BrDialogPlates.this.mGUIManager.closeGUI(null, 1);
            }
        });
        ((Button) viewInflate.findViewById(R.id.br_plates_button_refresh)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                BrDialogPlates.this.onPlateGuiRefreshButtonPressed();
            }
        });
        ((Button) viewInflate.findViewById(R.id.br_plates_button_buy)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.plates.BrDialogPlates.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                String string;
                if (BrDialogPlates.this.mChosenCountry == -1) {
                    return;
                }
                String string2 = BrDialogPlates.this.mEditTexts[BrDialogPlates.this.mChosenCountry].getText().toString();
                if (BrDialogPlates.this.mChosenCountry != 0) {
                    string = "tt";
                } else {
                    string = BrDialogPlates.this.mEtRegRu.getText().toString();
                }
                if (BrDialogPlates.this.mChosenCountry == 3) {
                    string = BrDialogPlates.this.mEtRegKz.getText().toString();
                }
                BrDialogPlates.this.onBuyButtonPressed(string2, string);
            }
        });
        return viewInflate;
    }

    public void setPlateTexts(String plate, String reg) {
        int i = this.mChosenCountry;
        if (i == -1) {
            return;
        }
        this.mEditTexts[i].setText(plate);
        int i2 = this.mChosenCountry;
        if (i2 == 0) {
            this.mEtRegRu.setText(reg);
        } else {
            if (i2 != 3) {
                return;
            }
            this.mEtRegKz.setText(reg);
        }
    }

    public final void onRusChosen() throws JSONException {
        this.mPlatesFormat.setText(Html.fromHtml(getString(R.string.plates_rus_number_format)));
        this.mPlatesAllowed.setText(Html.fromHtml(getString(R.string.plates_rus_allowed_symbols)));
        this.mLayoutList[0].setVisibility(0);
        this.mLayoutList[1].setVisibility(8);
        this.mLayoutList[2].setVisibility(8);
        this.mLayoutList[3].setVisibility(8);
        if (this.mType == 1) {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(true);
            this.mEditTexts[this.mChosenCountry].setEnabled(true);
            this.mEtRegRu.setEnabled(true);
            this.mEtRegRu.setFocusableInTouchMode(true);
        } else {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(false);
            this.mEditTexts[this.mChosenCountry].setEnabled(false);
            this.mEtRegRu.setEnabled(false);
            this.mEtRegRu.setFocusableInTouchMode(false);
        }
        this.mEditTexts[0].setText("");
        this.mEtRegRu.setText("");
        onPlateGuiCountryClicked(0);
    }

    public final void onUaChosen() throws JSONException {
        this.mPlatesFormat.setText(Html.fromHtml(getString(R.string.plates_ua_number_format)));
        this.mPlatesAllowed.setText(Html.fromHtml(getString(R.string.plates_ua_allowed_symbols)));
        this.mLayoutList[0].setVisibility(8);
        this.mLayoutList[1].setVisibility(0);
        this.mLayoutList[2].setVisibility(8);
        this.mLayoutList[3].setVisibility(8);
        if (this.mType == 1) {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(true);
            this.mEditTexts[this.mChosenCountry].setEnabled(true);
        } else {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(false);
            this.mEditTexts[this.mChosenCountry].setEnabled(false);
        }
        this.mEditTexts[this.mChosenCountry].setText("");
        onPlateGuiCountryClicked(1);
    }

    public final void onBuChosen() throws JSONException {
        this.mPlatesFormat.setText(Html.fromHtml(getString(R.string.plates_by_number_format)));
        this.mPlatesAllowed.setText(Html.fromHtml(getString(R.string.plates_by_allowed_symbols)));
        this.mLayoutList[0].setVisibility(8);
        this.mLayoutList[1].setVisibility(8);
        this.mLayoutList[2].setVisibility(0);
        this.mLayoutList[3].setVisibility(8);
        if (this.mType == 1) {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(true);
            this.mEditTexts[this.mChosenCountry].setEnabled(true);
        } else {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(false);
            this.mEditTexts[this.mChosenCountry].setEnabled(false);
        }
        this.mEditTexts[2].setText("");
        onPlateGuiCountryClicked(2);
    }

    public final void onKzChosen() throws JSONException {
        this.mPlatesFormat.setText(Html.fromHtml(getString(R.string.plates_kz_number_format)));
        this.mPlatesAllowed.setText(Html.fromHtml(getString(R.string.plates_kz_allowed_symbols)));
        this.mLayoutList[0].setVisibility(8);
        this.mLayoutList[1].setVisibility(8);
        this.mLayoutList[2].setVisibility(8);
        this.mLayoutList[3].setVisibility(0);
        if (this.mType == 1) {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(true);
            this.mEditTexts[this.mChosenCountry].setEnabled(true);
            this.mEtRegKz.setEnabled(true);
            this.mEtRegKz.setFocusableInTouchMode(true);
        } else {
            this.mEditTexts[this.mChosenCountry].setFocusableInTouchMode(false);
            this.mEditTexts[this.mChosenCountry].setEnabled(false);
            this.mEtRegKz.setEnabled(false);
            this.mEtRegKz.setFocusableInTouchMode(false);
        }
        this.mEditTexts[3].setEnabled(true);
        this.mEditTexts[3].setText("");
        this.mEtRegKz.setText("");
        onPlateGuiCountryClicked(3);
    }

    public final boolean isNumberValid(String input, char[] valid) {
        for (int i = 0; i < input.length(); i++) {
            boolean z = false;
            for (char c : valid) {
                if (input.charAt(i) == c) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRuNumber(String input) {
        return input.length() == 6 && !Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1)) && Character.isDigit(input.charAt(2)) && Character.isDigit(input.charAt(3)) && !Character.isDigit(input.charAt(4)) && !Character.isDigit(input.charAt(5));
    }

    public final boolean isUANumber(String input) {
        return input.length() == 10 && !Character.isDigit(input.charAt(0)) && !Character.isDigit(input.charAt(1)) && input.charAt(2) == ' ' && Character.isDigit(input.charAt(3)) && Character.isDigit(input.charAt(4)) && Character.isDigit(input.charAt(5)) && Character.isDigit(input.charAt(6)) && input.charAt(7) == ' ' && !Character.isDigit(input.charAt(8)) && !Character.isDigit(input.charAt(9));
    }

    public final boolean isBYNumber(String input) {
        return input.length() == 9 && Character.isDigit(input.charAt(8)) && input.charAt(7) == '-' && Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1)) && Character.isDigit(input.charAt(2)) && Character.isDigit(input.charAt(3)) && input.charAt(4) == ' ' && !Character.isDigit(input.charAt(5)) && !Character.isDigit(input.charAt(6));
    }

    public final boolean isKZNumber(String input) {
        return input.length() == 6 && Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1)) && Character.isDigit(input.charAt(2)) && !Character.isDigit(input.charAt(3)) && !Character.isDigit(input.charAt(4)) && !Character.isDigit(input.charAt(5));
    }

    public final boolean isRegCorrect(String input) {
        if (this.mChosenCountry == 0 && isNumberValid(input, this.mAllowedReg)) {
            return true;
        }
        return this.mChosenCountry == 3 && isNumberValid(input, this.mAllowedReg);
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
            if (i != 0) {
                if (i == 1) {
                    setHint(json.getString("h"));
                } else if (i != 2) {
                } else {
                    setPlateTexts(json.getString("p"), json.getString("r"));
                }
            } else if (this.mType == 0) {
                setPricesRub(json.getInt("p"), json.getInt("pr"));
            } else {
                setPricesBC(json.getInt("p"), json.getInt("pr"));
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        show(activity.getSupportFragmentManager(), "dialog");
        try {
            this.mType = json.getInt("t");
        } catch (Exception unused) {
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        dismissAllowingStateLoss();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        if (getDialog() == null) {
            return false;
        }
        return getDialog().isShowing();
    }

    public void onPlateGuiClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 0);
            this.mGUIManager.sendJsonData(1, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onPlateGuiCountryClicked(int code) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("c", code);
            this.mGUIManager.sendJsonData(1, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onPlateGuiRefreshButtonPressed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 2);
            this.mGUIManager.sendJsonData(1, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onBuyButtonPressed(String plate, String region) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 3);
            jSONObject.put("p", plate);
            jSONObject.put("r", region);
            this.mGUIManager.sendJsonData(1, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void onPlateChangedText(int country, String plate, String region) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 4);
            jSONObject.put("c", country);
            jSONObject.put("p", plate);
            jSONObject.put("r", region);
            this.mGUIManager.sendJsonData(1, jSONObject);
        } catch (Exception unused) {
        }
    }
}
