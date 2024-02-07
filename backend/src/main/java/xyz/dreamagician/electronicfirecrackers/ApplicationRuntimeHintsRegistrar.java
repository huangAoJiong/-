package xyz.dreamagician.electronicfirecrackers;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;
import xyz.dreamagician.electronicfirecrackers.model.*;
import xyz.dreamagician.electronicfirecrackers.model.socket.SocketServerSendPack;
import xyz.dreamagician.electronicfirecrackers.model.socket.SocketServerSendPackType;
import xyz.dreamagician.electronicfirecrackers.model.socket.SocketServerSendPlayerGameDataPack;

public class ApplicationRuntimeHintsRegistrar implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection().registerTypes(TypeReference.listOf(
                SocketServerSendPack.class,
                SocketServerSendPackType.class,
                SocketServerSendPlayerGameDataPack.class,
                PlayerGameData.class,
                PlayerDto.class,
                StrandType.class,
                StrandStatusDto.class,
                BlessingDto.class
        ), (typeHint) -> typeHint.withMembers(MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.DECLARED_FIELDS, MemberCategory.INVOKE_DECLARED_METHODS));
    }
}
