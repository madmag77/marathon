package com.malinskiy.marathon.device

import com.malinskiy.marathon.vendor.VendorConfiguration
import kotlinx.coroutines.channels.Channel

interface DeviceProvider {
    sealed class DeviceEvent {
        class DeviceConnected(val device: Device) : DeviceEvent()
        class DeviceDisconnected(val device: Device) : DeviceEvent()
    }

    fun initialize(vendorConfiguration: VendorConfiguration)
    fun subscribe() : Channel<DeviceEvent>
    fun terminate()
}