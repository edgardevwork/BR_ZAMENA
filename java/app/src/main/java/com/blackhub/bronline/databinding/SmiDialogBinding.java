package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class SmiDialogBinding implements ViewBinding {

    @NonNull
    public final ImageView bgQueueNumber;

    @NonNull
    public final LinearLayout bodySmiEditor;

    @NonNull
    public final LinearLayout bottomSmiEditor;

    @NonNull
    public final ImageView buttonBackToMenuInThirdColumn;

    @NonNull
    public final ImageButton buttonChangeViewAds;

    @NonNull
    public final AppCompatButton buttonDeleteInfoSmi;

    @NonNull
    public final ConstraintLayout buttonReplaceSmiInfo;

    @NonNull
    public final AppCompatButton buttonSendInfoSmi;

    @NonNull
    public final LinearLayout fourthColumn;

    @NonNull
    public final TextView headerSecondColumn;

    @NonNull
    public final LinearLayout headerSmiEditor;

    @NonNull
    public final TextView headerStartText;

    @NonNull
    public final TextView headerThirdsColumn;

    @NonNull
    public final View lineInHeader;

    @NonNull
    public final EditText personalSmiWriter;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvSecondColumn;

    @NonNull
    public final RecyclerView rvThirdColumn;

    @NonNull
    public final TextView textInHeader;

    @NonNull
    public final TextView textNext;

    @NonNull
    public final RecyclerView typeAds;

    @NonNull
    public final EditText valuePrice;

    @NonNull
    public final TextView valueQueue;

    public SmiDialogBinding(@NonNull RelativeLayout rootView, @NonNull ImageView bgQueueNumber, @NonNull LinearLayout bodySmiEditor, @NonNull LinearLayout bottomSmiEditor, @NonNull ImageView buttonBackToMenuInThirdColumn, @NonNull ImageButton buttonChangeViewAds, @NonNull AppCompatButton buttonDeleteInfoSmi, @NonNull ConstraintLayout buttonReplaceSmiInfo, @NonNull AppCompatButton buttonSendInfoSmi, @NonNull LinearLayout fourthColumn, @NonNull TextView headerSecondColumn, @NonNull LinearLayout headerSmiEditor, @NonNull TextView headerStartText, @NonNull TextView headerThirdsColumn, @NonNull View lineInHeader, @NonNull EditText personalSmiWriter, @NonNull RecyclerView rvSecondColumn, @NonNull RecyclerView rvThirdColumn, @NonNull TextView textInHeader, @NonNull TextView textNext, @NonNull RecyclerView typeAds, @NonNull EditText valuePrice, @NonNull TextView valueQueue) {
        this.rootView = rootView;
        this.bgQueueNumber = bgQueueNumber;
        this.bodySmiEditor = bodySmiEditor;
        this.bottomSmiEditor = bottomSmiEditor;
        this.buttonBackToMenuInThirdColumn = buttonBackToMenuInThirdColumn;
        this.buttonChangeViewAds = buttonChangeViewAds;
        this.buttonDeleteInfoSmi = buttonDeleteInfoSmi;
        this.buttonReplaceSmiInfo = buttonReplaceSmiInfo;
        this.buttonSendInfoSmi = buttonSendInfoSmi;
        this.fourthColumn = fourthColumn;
        this.headerSecondColumn = headerSecondColumn;
        this.headerSmiEditor = headerSmiEditor;
        this.headerStartText = headerStartText;
        this.headerThirdsColumn = headerThirdsColumn;
        this.lineInHeader = lineInHeader;
        this.personalSmiWriter = personalSmiWriter;
        this.rvSecondColumn = rvSecondColumn;
        this.rvThirdColumn = rvThirdColumn;
        this.textInHeader = textInHeader;
        this.textNext = textNext;
        this.typeAds = typeAds;
        this.valuePrice = valuePrice;
        this.valueQueue = valueQueue;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SmiDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SmiDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.smi_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SmiDialogBinding bind(@NonNull View rootView) {
        int i = R.id.bg_queue_number;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_queue_number);
        if (imageView != null) {
            i = R.id.body_smi_editor;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.body_smi_editor);
            if (linearLayout != null) {
                i = R.id.bottom_smi_editor;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_smi_editor);
                if (linearLayout2 != null) {
                    i = R.id.button_back_to_menu_in_third_column;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_back_to_menu_in_third_column);
                    if (imageView2 != null) {
                        i = R.id.button_change_view_ads;
                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.button_change_view_ads);
                        if (imageButton != null) {
                            i = R.id.button_delete_info_smi;
                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_delete_info_smi);
                            if (appCompatButton != null) {
                                i = R.id.button_replace_smi_info;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.button_replace_smi_info);
                                if (constraintLayout != null) {
                                    i = R.id.button_send_info_smi;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_send_info_smi);
                                    if (appCompatButton2 != null) {
                                        i = R.id.fourth_column;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fourth_column);
                                        if (linearLayout3 != null) {
                                            i = R.id.header_second_column;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_second_column);
                                            if (textView != null) {
                                                i = R.id.header_smi_editor;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header_smi_editor);
                                                if (linearLayout4 != null) {
                                                    i = R.id.header_start_text;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_start_text);
                                                    if (textView2 != null) {
                                                        i = R.id.header_thirds_column;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_thirds_column);
                                                        if (textView3 != null) {
                                                            i = R.id.line_in_header;
                                                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.line_in_header);
                                                            if (viewFindChildViewById != null) {
                                                                i = R.id.personal_smi_writer;
                                                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.personal_smi_writer);
                                                                if (editText != null) {
                                                                    i = R.id.rv_second_column;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_second_column);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.rv_third_column;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_third_column);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.text_in_header;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_in_header);
                                                                            if (textView4 != null) {
                                                                                i = R.id.text_next;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_next);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.type_ads;
                                                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.type_ads);
                                                                                    if (recyclerView3 != null) {
                                                                                        i = R.id.value_price;
                                                                                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.value_price);
                                                                                        if (editText2 != null) {
                                                                                            i = R.id.value_queue;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_queue);
                                                                                            if (textView6 != null) {
                                                                                                return new SmiDialogBinding((RelativeLayout) rootView, imageView, linearLayout, linearLayout2, imageView2, imageButton, appCompatButton, constraintLayout, appCompatButton2, linearLayout3, textView, linearLayout4, textView2, textView3, viewFindChildViewById, editText, recyclerView, recyclerView2, textView4, textView5, recyclerView3, editText2, textView6);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
