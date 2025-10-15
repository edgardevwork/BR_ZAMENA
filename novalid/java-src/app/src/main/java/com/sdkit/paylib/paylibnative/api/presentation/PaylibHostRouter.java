package com.sdkit.paylib.paylibnative.api.presentation;

import androidx.fragment.app.Fragment;
import com.sdkit.paylib.paylibnative.api.entity.HostInsets;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibHostRouter;", "", "close", "", "insetsForFragment", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sdkit/paylib/paylibnative/api/entity/HostInsets;", FeatureParser.PluginHandler.FRAGMENT, "Landroidx/fragment/app/Fragment;", "openCards", "showPaylibFragment", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibHostRouter {
    void close();

    Flow<HostInsets> insetsForFragment(Fragment fragment);

    void openCards();

    void showPaylibFragment(Fragment fragment);
}
