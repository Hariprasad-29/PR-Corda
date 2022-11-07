package net.corda.samples.tokentofriend.states;

import com.r3.corda.lib.tokens.contracts.types.TokenPointer;
import net.corda.samples.tokentofriend.contracts.CustomTokenContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.LinearPointer;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.Party;
import com.r3.corda.lib.tokens.contracts.states.EvolvableTokenType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@BelongsToContract(CustomTokenContract.class)
public class CustomTokenState extends EvolvableTokenType {

    private String message;
    private Party maintainer;
    private int fractionDigits;
    private UniqueIdentifier linearId;

    public CustomTokenState(String message, Party maintainer, int fractionDigits, UniqueIdentifier linearId) {
        this.message = message;
        this.maintainer = maintainer;
        this.fractionDigits = fractionDigits;
        this.linearId = linearId;
    }



    public String getMessage() {
        return message;
    }

    public Party getMaintainer() {
        return maintainer;
    }

    @Override
    public int getFractionDigits() {
        return fractionDigits;
    }

    @NotNull
    @Override
    public UniqueIdentifier getLinearId() {
        return linearId;
    }



    public void setMessage(String message) {
        this.message = message;
    }

    public void setMaintainer(Party maintainer) {
        this.maintainer = maintainer;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }

    public void setLinearId(UniqueIdentifier linearId) {
        this.linearId = linearId;
    }

    @NotNull
    @Override
    public List<Party> getMaintainers() {
        List<Party> maintainers = new ArrayList<Party>();
        maintainers.add(this.maintainer);
        return maintainers;
    }

    /* This method returns a TokenPointer by using the linear Id of the evolvable state */
    public TokenPointer<CustomTokenState> toPointer(){
        LinearPointer<CustomTokenState> linearPointer = new LinearPointer<>(linearId, CustomTokenState.class);
        return new TokenPointer<>(linearPointer, fractionDigits);
    }
}
