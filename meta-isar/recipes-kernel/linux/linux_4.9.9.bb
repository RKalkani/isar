# Sample application
#
# This software is a part of ISAR.
# Copyright (C) 2015-2016 ilbers GmbH

DESCRIPTION = "Linux Kernel"

LICENSE = "gpl-2.0"
LIC_FILES_CHKSUM = "file://${LAYERDIR_isar}/licenses/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/ilbers/linux.git;branch=lenormf/linux-4.9.9-deb"
SRCREV = "b7ab449238b8e59943849a10c95d578aa01d70e7"

SRC_DIR = "git"

inherit dpkg
