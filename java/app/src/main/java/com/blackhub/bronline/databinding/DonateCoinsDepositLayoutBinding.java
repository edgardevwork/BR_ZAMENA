package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;


public final class DonateCoinsDepositLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton button;

    @NonNull
    public final ComposeView cvDonateDepositCoins;

    @NonNull
    public final EditText email;

    @NonNull
    public final Group groupX2;

    @NonNull
    public final TextView headerProposals;

    @NonNull
    public final Group hot;

    @NonNull
    public final ImageView imageViewPlus;

    @NonNull
    public final ConstraintLayout mlDonateCoinsDeposit;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final RecyclerView recyclerViewProposals;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final TextView sales;

    @NonNull
    public final TextView textViewBuyBlackCoins;

    @NonNull
    public final TextView textViewRefill;

    @NonNull
    public final TextView textViewX2BlackCoins;

    @NonNull
    public final EditText value;

    @NonNull
    public final View viewRootRight;

    @NonNull
    public final View viewX2Root;

    public DonateCoinsDepositLayoutBinding(@NonNull FrameLayout rootView, @NonNull AppCompatButton button, @NonNull ComposeView cvDonateDepositCoins, @NonNull EditText email, @NonNull Group groupX2, @NonNull TextView headerProposals, @NonNull Group hot, @NonNull ImageView imageViewPlus, @NonNull ConstraintLayout mlDonateCoinsDeposit, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerViewProposals, @NonNull TextView sales, @NonNull TextView textViewBuyBlackCoins, @NonNull TextView textViewRefill, @NonNull TextView textViewX2BlackCoins, @NonNull EditText value, @NonNull View viewRootRight, @NonNull View viewX2Root) {
        this.rootView = rootView;
        this.button = button;
        this.cvDonateDepositCoins = cvDonateDepositCoins;
        this.email = email;
        this.groupX2 = groupX2;
        this.headerProposals = headerProposals;
        this.hot = hot;
        this.imageViewPlus = imageViewPlus;
        this.mlDonateCoinsDeposit = mlDonateCoinsDeposit;
        this.progressBar = progressBar;
        this.recyclerViewProposals = recyclerViewProposals;
        this.sales = sales;
        this.textViewBuyBlackCoins = textViewBuyBlackCoins;
        this.textViewRefill = textViewRefill;
        this.textViewX2BlackCoins = textViewX2BlackCoins;
        this.value = value;
        this.viewRootRight = viewRootRight;
        this.viewX2Root = viewX2Root;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DonateCoinsDepositLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DonateCoinsDepositLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.donate_coins_deposit_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DonateCoinsDepositLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button);
        if (appCompatButton != null) {
            i = R.id.cv_donate_deposit_coins;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.cv_donate_deposit_coins);
            if (composeView != null) {
                i = R.id.email;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.email);
                if (editText != null) {
                    i = R.id.group_x2;
                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.group_x2);
                    if (group != null) {
                        i = R.id.header_proposals;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header_proposals);
                        if (textView != null) {
                            i = R.id.hot;
                            Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.hot);
                            if (group2 != null) {
                                i = R.id.image_view_plus;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_plus);
                                if (imageView != null) {
                                    i = R.id.mlDonateCoinsDeposit;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mlDonateCoinsDeposit);
                                    if (constraintLayout != null) {
                                        i = R.id.progress_bar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                                        if (progressBar != null) {
                                            i = R.id.recycler_view_proposals;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_proposals);
                                            if (recyclerView != null) {
                                                i = R.id.sales;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sales);
                                                if (textView2 != null) {
                                                    i = R.id.text_view_buy_black_coins;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_buy_black_coins);
                                                    if (textView3 != null) {
                                                        i = R.id.text_view_refill;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_refill);
                                                        if (textView4 != null) {
                                                            i = R.id.text_view_x2_black_coins;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_x2_black_coins);
                                                            if (textView5 != null) {
                                                                i = R.id.value;
                                                                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.value);
                                                                if (editText2 != null) {
                                                                    i = R.id.view_root_right;
                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_root_right);
                                                                    if (viewFindChildViewById != null) {
                                                                        i = R.id.view_x2_root;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view_x2_root);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            return new DonateCoinsDepositLayoutBinding((FrameLayout) rootView, appCompatButton, composeView, editText, group, textView, group2, imageView, constraintLayout, progressBar, recyclerView, textView2, textView3, textView4, textView5, editText2, viewFindChildViewById, viewFindChildViewById2);
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
