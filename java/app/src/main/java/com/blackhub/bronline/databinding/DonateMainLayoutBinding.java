package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;


public final class DonateMainLayoutBinding implements ViewBinding {

    @NonNull
    public final ComposeView composeViewDonate;

    @NonNull
    public final ComposeView composeViewFirstDonateFullScreen;

    @NonNull
    public final ComposeView composeViewSecondDonateFullScreen;

    @NonNull
    public final UIContainer donateBodyContainer;

    @NonNull
    public final ImageButton donateButtonExit;

    @NonNull
    public final ImageButton donateFooterLeft;

    @NonNull
    public final RecyclerView donateFooterRV;

    @NonNull
    public final ImageButton donateFooterRight;

    @NonNull
    public final ImageButton donateHeaderButtonBc;

    @NonNull
    public final ImageButton donateHeaderButtonRub;

    @NonNull
    public final View donateHeaderGroup1;

    @NonNull
    public final View donateHeaderGroup2;

    @NonNull
    public final View donateHeaderGroup3;

    @NonNull
    public final ImageButton donateHeaderLeft;

    @NonNull
    public final RecyclerView donateHeaderRV;

    @NonNull
    public final ImageButton donateHeaderRight;

    @NonNull
    public final TextView donateHeaderTitleBc;

    @NonNull
    public final TextView donateHeaderTitleRub;

    @NonNull
    public final TextView donateHeaderValueBc;

    @NonNull
    public final TextView donateHeaderValueRub;

    @NonNull
    public final Group groupFooter;

    @NonNull
    public final ConstraintLayout rootView;

    public DonateMainLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ComposeView composeViewDonate, @NonNull ComposeView composeViewFirstDonateFullScreen, @NonNull ComposeView composeViewSecondDonateFullScreen, @NonNull UIContainer donateBodyContainer, @NonNull ImageButton donateButtonExit, @NonNull ImageButton donateFooterLeft, @NonNull RecyclerView donateFooterRV, @NonNull ImageButton donateFooterRight, @NonNull ImageButton donateHeaderButtonBc, @NonNull ImageButton donateHeaderButtonRub, @NonNull View donateHeaderGroup1, @NonNull View donateHeaderGroup2, @NonNull View donateHeaderGroup3, @NonNull ImageButton donateHeaderLeft, @NonNull RecyclerView donateHeaderRV, @NonNull ImageButton donateHeaderRight, @NonNull TextView donateHeaderTitleBc, @NonNull TextView donateHeaderTitleRub, @NonNull TextView donateHeaderValueBc, @NonNull TextView donateHeaderValueRub, @NonNull Group groupFooter) {
        this.rootView = rootView;
        this.composeViewDonate = composeViewDonate;
        this.composeViewFirstDonateFullScreen = composeViewFirstDonateFullScreen;
        this.composeViewSecondDonateFullScreen = composeViewSecondDonateFullScreen;
        this.donateBodyContainer = donateBodyContainer;
        this.donateButtonExit = donateButtonExit;
        this.donateFooterLeft = donateFooterLeft;
        this.donateFooterRV = donateFooterRV;
        this.donateFooterRight = donateFooterRight;
        this.donateHeaderButtonBc = donateHeaderButtonBc;
        this.donateHeaderButtonRub = donateHeaderButtonRub;
        this.donateHeaderGroup1 = donateHeaderGroup1;
        this.donateHeaderGroup2 = donateHeaderGroup2;
        this.donateHeaderGroup3 = donateHeaderGroup3;
        this.donateHeaderLeft = donateHeaderLeft;
        this.donateHeaderRV = donateHeaderRV;
        this.donateHeaderRight = donateHeaderRight;
        this.donateHeaderTitleBc = donateHeaderTitleBc;
        this.donateHeaderTitleRub = donateHeaderTitleRub;
        this.donateHeaderValueBc = donateHeaderValueBc;
        this.donateHeaderValueRub = donateHeaderValueRub;
        this.groupFooter = groupFooter;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateMainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateMainLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_main_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateMainLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.compose_view_donate;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.compose_view_donate);
        if (composeView != null) {
            i = R.id.composeViewFirstDonateFullScreen;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.composeViewFirstDonateFullScreen);
            if (composeView2 != null) {
                i = R.id.composeViewSecondDonateFullScreen;
                ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.composeViewSecondDonateFullScreen);
                if (composeView3 != null) {
                    i = R.id.donate_body_container;
                    UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.donate_body_container);
                    if (uIContainer != null) {
                        i = R.id.donate_button_exit;
                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_button_exit);
                        if (imageButton != null) {
                            i = R.id.donate_footer_left;
                            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_footer_left);
                            if (imageButton2 != null) {
                                i = R.id.donate_footer_RV;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.donate_footer_RV);
                                if (recyclerView != null) {
                                    i = R.id.donate_footer_right;
                                    ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_footer_right);
                                    if (imageButton3 != null) {
                                        i = R.id.donate_header_button_bc;
                                        ImageButton imageButton4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_header_button_bc);
                                        if (imageButton4 != null) {
                                            i = R.id.donate_header_button_rub;
                                            ImageButton imageButton5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_header_button_rub);
                                            if (imageButton5 != null) {
                                                i = R.id.donate_header_group_1;
                                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.donate_header_group_1);
                                                if (viewFindChildViewById != null) {
                                                    i = R.id.donate_header_group_2;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.donate_header_group_2);
                                                    if (viewFindChildViewById2 != null) {
                                                        i = R.id.donate_header_group_3;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.donate_header_group_3);
                                                        if (viewFindChildViewById3 != null) {
                                                            i = R.id.donate_header_left;
                                                            ImageButton imageButton6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_header_left);
                                                            if (imageButton6 != null) {
                                                                i = R.id.donate_header_RV;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.donate_header_RV);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.donate_header_right;
                                                                    ImageButton imageButton7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.donate_header_right);
                                                                    if (imageButton7 != null) {
                                                                        i = R.id.donate_header_title_bc;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_header_title_bc);
                                                                        if (textView != null) {
                                                                            i = R.id.donate_header_title_rub;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_header_title_rub);
                                                                            if (textView2 != null) {
                                                                                i = R.id.donate_header_value_bc;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_header_value_bc);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.donate_header_value_rub;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.donate_header_value_rub);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.groupFooter;
                                                                                        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.groupFooter);
                                                                                        if (group != null) {
                                                                                            return new DonateMainLayoutBinding((ConstraintLayout) rootView, composeView, composeView2, composeView3, uIContainer, imageButton, imageButton2, recyclerView, imageButton3, imageButton4, imageButton5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageButton6, recyclerView2, imageButton7, textView, textView2, textView3, textView4, group);
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
