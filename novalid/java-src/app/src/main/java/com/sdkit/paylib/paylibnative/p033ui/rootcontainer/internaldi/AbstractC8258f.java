package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8360b;
import com.sdkit.paylib.paylibnative.p033ui.utils.viewmodels.AbstractC8377a;
import com.sdkit.paylib.paylibnative.p033ui.utils.viewmodels.C8378b;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.f */
/* loaded from: classes6.dex */
public abstract class AbstractC8258f extends AbstractC8377a {

    /* renamed from: c */
    public final PaylibLogger f2713c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.f$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ViewModel f2714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModel viewModel) {
            super(0);
            this.f2714a = viewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "create: got " + C8360b.m3430a(this.f2714a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8258f(Map withoutArgs, PaylibLoggerFactory loggerFactory) {
        super(withoutArgs, null, 2, null);
        Intrinsics.checkNotNullParameter(withoutArgs, "withoutArgs");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2713c = loggerFactory.get("PaylibNativeViewModelsProvider");
    }

    /* renamed from: a */
    public final ViewModel m2480a(Fragment fragment, Class clazz) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ViewModel viewModel = new ViewModelProvider(fragment.getViewModelStore(), new C8378b(m3483a(clazz))).get(clazz);
        PaylibLogger.DefaultImpls.d$default(this.f2713c, null, new a(viewModel), 1, null);
        return viewModel;
    }
}
