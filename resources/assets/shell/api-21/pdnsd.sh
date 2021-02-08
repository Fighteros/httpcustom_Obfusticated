#!/system/bin/sh

DIR=$7
CDIR=$8

PATH=$DIR:$PATH

case $1 in
 start)
 echo "
global {
 perm_cache = 1024;
 cache_dir = \"$CDIR\";
 server_port = 8091;
 server_ip = $2;
 query_method = tcp_only;
 min_ttl = 15m;
 max_ttl = 1w;
 timeout = 10;
 daemon = on;
}

server {
 label = dns1;
 ip = $3;
 port = $4;
 uptest = none;
}

server {
 label = dns2;
 ip = $5;
 port = $6;
 uptest = none;
}

rr {
 name=localhost;
 reverse=on;
 a=127.0.0.1;
 owner=localhost;
 soa=localhost,root.localhost,42,86400,900,86400,86400;
}
" >>$DIR/pdnsd.conf

  if [[ ! -e $CDIR ]]; then
   mkdir $CDIR
  fi

  if [[ ! -e $CDIR/pdnsd.cache ]]; then
   echo "" >>$CDIR/pdnsd.cache
  fi

 $DIR/pdnsd -p $DIR/pdnsd.pid -c $DIR/pdnsd.conf
 
 ;;
 stop)
  
#  if [ -e $DIR/pdnsd.pid ]; then
#   kill -9 `cat $DIR/pdnsd.pid`
#   rm $DIR/pdnsd.pid
#  else
#   killall -9 pdnsd
#   busybox killall -9 pdnsd
#  fi
#
#  rm $DIR/pdnsd.conf

  busybox killall -9 pdnsd
  killall -9 pdnsd

  toolbox kill -9 `cat $DIR/pdnsd.pid`
  busybox kill -9 `cat $DIR/pdnsd.pid`
  kill -9 `cat $DIR/pdnsd.pid`

  rm $DIR/pdnsd.pid
  rm $DIR/pdnsd.conf
  rm $CDIR/pdnsd.cache
  
  ;;
esac