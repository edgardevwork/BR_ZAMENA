package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class FragmentViewBindingDelegate implements ReadOnlyProperty {

    /* renamed from: a */
    public final Fragment f3653a;

    /* renamed from: b */
    public final Function1 f3654b;

    /* renamed from: c */
    public ViewBinding f3655c;

    public FragmentViewBindingDelegate(Fragment fragment, Function1 viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.f3653a = fragment;
        this.f3654b = viewBindingFactory;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ViewBinding getValue(Fragment thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        ViewBinding viewBinding = this.f3655c;
        if (viewBinding != null) {
            return viewBinding;
        }
        final Lifecycle lifecycle = this.f3653a.getViewLifecycleOwner().getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "fragment.viewLifecycleOwner.lifecycle");
        Function1 function1 = this.f3654b;
        View viewRequireView = thisRef.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "thisRef.requireView()");
        ViewBinding viewBinding2 = (ViewBinding) function1.invoke(viewRequireView);
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            this.f3655c = viewBinding2;
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.sdkit.paylib.paylibnative.ui.utils.FragmentViewBindingDelegate.getValue.2
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    FragmentViewBindingDelegate.this.f3655c = null;
                    lifecycle.removeObserver(this);
                }
            });
        }
        return viewBinding2;
    }
}
