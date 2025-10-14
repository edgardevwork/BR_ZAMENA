package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentDiagnosticsBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backToSubmenuDiagnostics;

    @NonNull
    public final LinearLayout blockTextDiagnostics;

    @NonNull
    public final View helpViewInDiagnostic;

    @NonNull
    public final LinearLayout menuBlockDiagnostics;

    @NonNull
    public final RecyclerView recvDetailsListDiagnostics;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView titleActualDiagnostics;

    @NonNull
    public final TextView titleDiagnostics;

    @NonNull
    public final AppCompatButton tuningDiagnostics;

    public TuningFragmentDiagnosticsBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backToSubmenuDiagnostics, @NonNull LinearLayout blockTextDiagnostics, @NonNull View helpViewInDiagnostic, @NonNull LinearLayout menuBlockDiagnostics, @NonNull RecyclerView recvDetailsListDiagnostics, @NonNull TextView titleActualDiagnostics, @NonNull TextView titleDiagnostics, @NonNull AppCompatButton tuningDiagnostics) {
        this.rootView = rootView;
        this.backToSubmenuDiagnostics = backToSubmenuDiagnostics;
        this.blockTextDiagnostics = blockTextDiagnostics;
        this.helpViewInDiagnostic = helpViewInDiagnostic;
        this.menuBlockDiagnostics = menuBlockDiagnostics;
        this.recvDetailsListDiagnostics = recvDetailsListDiagnostics;
        this.titleActualDiagnostics = titleActualDiagnostics;
        this.titleDiagnostics = titleDiagnostics;
        this.tuningDiagnostics = tuningDiagnostics;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentDiagnosticsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentDiagnosticsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_diagnostics, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentDiagnosticsBinding bind(@NonNull View rootView) {
        int i = R.id.back_to_submenu_diagnostics;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_diagnostics);
        if (appCompatButton != null) {
            i = R.id.block_text_diagnostics;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.block_text_diagnostics);
            if (linearLayout != null) {
                i = R.id.help_view_in_diagnostic;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.help_view_in_diagnostic);
                if (viewFindChildViewById != null) {
                    i = R.id.menu_block_diagnostics;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_diagnostics);
                    if (linearLayout2 != null) {
                        i = R.id.recv_details_list_diagnostics;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_details_list_diagnostics);
                        if (recyclerView != null) {
                            i = R.id.title_actual_diagnostics;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_actual_diagnostics);
                            if (textView != null) {
                                i = R.id.title_diagnostics;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_diagnostics);
                                if (textView2 != null) {
                                    i = R.id.tuning_diagnostics;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.tuning_diagnostics);
                                    if (appCompatButton2 != null) {
                                        return new TuningFragmentDiagnosticsBinding((RelativeLayout) rootView, appCompatButton, linearLayout, viewFindChildViewById, linearLayout2, recyclerView, textView, textView2, appCompatButton2);
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
