# ANDROID STUDIO 3.1.4
sudo apt-get install libc6:i386 libncurses5:i386 libstdc++6:i386 lib32z1 libbz2-1.0:i386
cd
wget https://dl.google.com/dl/android/studio/ide-zips/3.1.4.0/android-studio-ide-173.4907809-linux.zip
sudo unzip android-studio-ide-*-linux.zip -d /opt/
cd /opt/android-studio/bin
./studio.sh
sudo ln -sf /opt/android-studio/bin/studio.sh /bin/android-studio

# CMAKE 3.6
version=3.6
build=2
mkdir ~/temp
cd ~/temp
wget https://cmake.org/files/v$version/cmake-$version.$build.tar.gz
tar -xzvf cmake-$version.$build.tar.gz
cd cmake-$version.$build/