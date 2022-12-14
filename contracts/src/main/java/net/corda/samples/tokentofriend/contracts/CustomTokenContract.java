package net.corda.samples.tokentofriend.contracts;

import com.r3.corda.lib.tokens.contracts.EvolvableTokenContract;
import net.corda.samples.tokentofriend.states.CustomTokenState;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;
import static net.corda.core.contracts.ContractsDSL.requireThat;

public class CustomTokenContract extends EvolvableTokenContract implements Contract {

    public static final String CONTRACT_ID = "net.corda.samples.tokentofriend.contracts.CustomTokenContract";


    @Override
    public void additionalCreateChecks(@NotNull LedgerTransaction tx) {

    }

    @Override
    public void additionalUpdateChecks(@NotNull LedgerTransaction tx) {
        /*This additional check does not apply to this use case.
         *This sample does not allow token update */
    }
}
