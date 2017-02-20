# Sample application
#
# This software is a part of ISAR.
# Copyright (C) 2015-2016 ilbers GmbH

require recipes-kernel/linux/linux.inc

SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"
SRCREV = "390caeedd4fdb95b2225768305d163c291f21b5a"
