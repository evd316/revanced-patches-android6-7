package app.revanced.patches.youtube.misc.openlinksdirectly.bytecode.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object OpenLinksDirectlyFingerprintPrimary : MethodFingerprint(
    returnType = "Ljava/lang/Object",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = listOf("Ljava/lang/Object"),
    opcodes = listOf(
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.RETURN_OBJECT,
        Opcode.CHECK_CAST,
        Opcode.SGET,
        Opcode.SGET_OBJECT
    )
)