#!/bin/sh

if ! /sbin/losetup -f >/dev/null 2>/dev/null; then
	# make sure the device node is present
	sudo /sbin/losetup -f
fi

docker run -v $(pwd):/isar:rw -e USER_ID=$(id -u) --rm -t --cap-add=SYS_ADMIN --cap-add=MKNOD --device $(/sbin/losetup -f) -i kasproject/kas-isar:0.10.0 sh -c "
	cd /isar &&
	kas build kas-qemuamd64-base.yml &&
	kas shell kas-qemuamd64-base.yml -c 'wic create sdimage-efi -o . -e multiconfig:qemuamd64-stretch:isar-image-base'
	"
