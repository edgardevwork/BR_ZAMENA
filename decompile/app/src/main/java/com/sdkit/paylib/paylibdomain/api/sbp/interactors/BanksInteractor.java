package com.sdkit.paylib.paylibdomain.api.sbp.interactors;

import com.sdkit.paylib.paylibdomain.api.entity.SbpBankInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/sbp/interactors/BanksInteractor;", "", "getSbpBanks", "Lkotlin/Result;", "", "Lcom/sdkit/paylib/paylibdomain/api/entity/SbpBankInfo;", "getSbpBanks-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface BanksInteractor {
    /* renamed from: getSbpBanks-IoAF18A, reason: not valid java name */
    Object mo15381getSbpBanksIoAF18A(Continuation<? super Result<? extends List<SbpBankInfo>>> continuation);
}
