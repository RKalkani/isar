DESCRIPTION = "Linux Kernel"

FILESPATH_prepend := "${THISDIR}/files:"

LICENSE = "gpl-2.0"
LIC_FILES_CHKSUM = "file://${LAYERDIR_isar}/licenses/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI += "file://debian/ \
            file://defconfig"

SRC_DIR = "git"

inherit dpkg

do_build_prepend() {
	cp ${BUILDROOT}/defconfig ${BUILDROOT}/${SRC_DIR}/arch/arm/configs/isar_defconfig
	cp -r ${BUILDROOT}/debian ${BUILDROOT}/${SRC_DIR}
}
