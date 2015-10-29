KV = "3.18.18"
SRCDATE = "20151028"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "7354d6f020f37000fd4136664fae99c2"
SRC_URI[sha256sum] = "4f167572912e6a19f5155c0b46ef55b722e908c86ecec076791a734f13a4ba8e"

COMPATIBLE_MACHINE = "et8500"
