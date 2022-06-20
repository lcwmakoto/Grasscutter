package emu.grasscutter.game.entity.gadget;

import emu.grasscutter.game.entity.EntityGadget;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.proto.InterOpTypeOuterClass;
import emu.grasscutter.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;

public abstract class GadgetContent {
    private final EntityGadget gadget;

    public GadgetContent(EntityGadget gadget) {
        this.gadget = gadget;
    }

    public EntityGadget getGadget() {
        return this.gadget;
    }

    public abstract boolean onInteract(Player player, InterOpTypeOuterClass.InterOpType opType);

    public abstract void onBuildProto(SceneGadgetInfo.Builder gadgetInfo);
}
