/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.holographicdisplays.nms.v1_21_R1;

import me.filoghost.holographicdisplays.nms.common.EntityID;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.PacketPlayOutEntityMetadata;

class EntityMetadataNMSPacket extends VersionNMSPacket {

    private final Packet<?> rawPacket;

    private EntityMetadataNMSPacket(PacketByteBuffer packetByteBuffer) {
        StreamCodec<RegistryFriendlyByteBuf, PacketPlayOutEntityMetadata> nmsCodec = PacketPlayOutEntityMetadata.a;
        RegistryFriendlyByteBuf registryFriendlyByteBuf = packetByteBuffer.getInternalBuffer();

        this.rawPacket = nmsCodec.decode(registryFriendlyByteBuf);
    }

    @Override
    Packet<?> getRawPacket() {
        return rawPacket;
    }

    public static DataWatcherPacketBuilder<EntityMetadataNMSPacket> builder(EntityID entityID) {
        PacketByteBuffer packetByteBuffer = PacketByteBuffer.get();
        packetByteBuffer.writeVarInt(entityID.getNumericID());
        return new Builder(packetByteBuffer);
    }

    private static class Builder extends DataWatcherPacketBuilder<EntityMetadataNMSPacket> {

        private Builder(PacketByteBuffer packetByteBuffer) {
            super(packetByteBuffer);
        }

        @Override
        EntityMetadataNMSPacket createPacket(PacketByteBuffer packetByteBuffer) {
            return new EntityMetadataNMSPacket(packetByteBuffer);
        }

    }

}
