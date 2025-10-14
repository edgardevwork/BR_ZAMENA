package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.e */
/* loaded from: classes6.dex */
public final class C8257e extends FragmentFactory {

    /* renamed from: a */
    public final Map f2712a;

    public C8257e(Map creators) {
        Intrinsics.checkNotNullParameter(creators, "creators");
        this.f2712a = creators;
    }

    /* renamed from: a */
    public final Fragment m2479a(ClassLoader classLoader, String str) {
        Fragment fragmentInstantiate = super.instantiate(classLoader, str);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "super.instantiate(classLoader, className)");
        return fragmentInstantiate;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        Class<? extends Fragment> clsLoadFragmentClass = FragmentFactory.loadFragmentClass(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(clsLoadFragmentClass, "loadFragmentClass(classLoader, className)");
        Provider provider = (Provider) this.f2712a.get(clsLoadFragmentClass);
        if (provider == null) {
            return m2479a(classLoader, className);
        }
        Object obj = provider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "creator.get()");
        return (Fragment) obj;
    }
}
